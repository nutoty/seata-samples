package cn.tedu.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author w9711
 * @create 2020/8/28 9:15
 */
@FeignClient(name = "storage")
public interface StorageClient {
    @GetMapping("/decrease")
    String decrease(@RequestParam Long productId, @RequestParam Integer count);
}
