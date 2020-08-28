package cn.tedu.account.controller;

import cn.tedu.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/27 16:15
 */
@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("decrease")
    public String decrease(Long userId, BigDecimal money) {
        accountService.decrease(userId,money);
        return "用户账户金额扣减成功";
    }
}
