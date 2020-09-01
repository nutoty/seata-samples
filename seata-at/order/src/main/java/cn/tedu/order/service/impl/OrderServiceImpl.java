package cn.tedu.order.service.impl;

import cn.tedu.order.entity.Order;
import cn.tedu.order.feign.AccountClient;
import cn.tedu.order.feign.EasyIdGeneratorClient;
import cn.tedu.order.feign.StorageClient;
import cn.tedu.order.mapper.OrderMapper;
import cn.tedu.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author w9711
 * @create 2020/8/27 18:46
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    EasyIdGeneratorClient easyIdGeneratorClient;

    @GlobalTransactional
    @Override
    public void create(Order order) {

        //从全局唯一id发号器获得id，这里暂时随机产生一个 orderId
        Long orderId = easyIdGeneratorClient.nextId("order_business");
        order.setId(orderId);
        orderMapper.create(order);

//        if(Math.random() < 0.5){
////            throw new RuntimeException("模拟异常");
////        }

        //调用storage，修改库存
        storageClient.decrease(order.getProductId(),order.getCount());
        //调用account，修改账户余额
        accountClient.decrease(order.getUserId(),order.getMoney());
    }
}
