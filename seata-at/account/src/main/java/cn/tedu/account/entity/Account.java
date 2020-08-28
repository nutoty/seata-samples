package cn.tedu.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/27 16:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long id;
    //用户id
    private Long userId;
    //总额度
    private BigDecimal total;
    //已用余额
    private BigDecimal used;
    //剩余可用额度
    private BigDecimal residue;
    //TCC事务锁定的金额
    private BigDecimal frozen;
}
