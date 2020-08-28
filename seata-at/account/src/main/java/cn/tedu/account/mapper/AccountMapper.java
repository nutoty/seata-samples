package cn.tedu.account.mapper;

import cn.tedu.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/27 16:09
 */
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(Long userId, BigDecimal money);
}
