package cn.tedu.storage.service.impl;

import cn.tedu.storage.mapper.StorageMapper;
import cn.tedu.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author w9711
 * @create 2020/8/27 17:13
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    //Transactional启动分支事务
    @Transactional
    @Override
    public void decrease(Long productId, Integer count) throws Exception {
        storageMapper.decrease(productId,count);

//        if(Math.random() < 0.5){
//            throw new RuntimeException("模拟异常");
//        }
    }
}
