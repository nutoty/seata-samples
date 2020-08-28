package cn.tedu.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author w9711
 * @create 2020/8/28 9:16
 */
@FeignClient(name = "account")
public interface AccountClient {
    @GetMapping("/account/decrease")
    String decrease(@RequestParam Long userId, @RequestParam BigDecimal money);
}
