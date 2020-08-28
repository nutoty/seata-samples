package cn.tedu.storage.mapper;

import cn.tedu.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Author w9711
 * @create 2020/8/27 17:11
 */
public interface StorageMapper extends BaseMapper<Storage> {
    void decrease(Long productId, Integer count);
}
