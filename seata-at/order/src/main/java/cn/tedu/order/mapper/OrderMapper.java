package cn.tedu.order.mapper;

import cn.tedu.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Author w9711
 * @create 2020/8/27 18:44
 */
public interface OrderMapper extends BaseMapper<Order> {
    void create(Order order);
}
