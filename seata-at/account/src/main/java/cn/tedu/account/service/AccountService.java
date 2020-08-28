package cn.tedu.account.service;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/27 16:11
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
