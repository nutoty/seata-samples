package cn.tedu.account.service.impl;

import cn.tedu.account.mapper.AccountMapper;
import cn.tedu.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/27 16:11
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountMapper.decrease(userId,money);

        if(Math.random() < 0.5){
            throw new RuntimeException("模拟异常");
        }
    }
}
