package cn.tedu.order.controller;

import cn.tedu.order.entity.Order;
import cn.tedu.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author w9711
 * @create 2020/8/27 18:50
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 用户用这个路径进行访问：
     * http://localhost:8083/create?userId=1&productId=1&count=10&money=100
     * @param order
     * @return
     */
    @GetMapping("/create")
    public String create(Order order){
        orderService.create(order);
        return "创建订单成功";
    }
}
