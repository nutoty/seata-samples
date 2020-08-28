package cn.tedu.storage.service;

/**
 * @Author w9711
 * @create 2020/8/27 17:12
 */
public interface StorageService {
    void decrease(Long productId, Integer count) throws Exception;
}
