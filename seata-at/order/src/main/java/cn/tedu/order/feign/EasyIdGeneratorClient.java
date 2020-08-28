package cn.tedu.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author w9711
 * @create 2020/8/28 9:12
 */
@FeignClient(name = "easy-id-generator")
public interface EasyIdGeneratorClient {
    @GetMapping("/segment/ids/next_id")
    Long nextId(@RequestParam String businessType);
}
