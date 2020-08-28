package cn.tedu.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author w9711
 * @create 2020/8/27 17:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    private Long id;
    //产品id
    private Long productId;
    //总库存
    private Integer total;
    //已用库存
    private Integer used;
    //剩余库存
    private Integer residue;
    //TCC事务锁定的库存
    private Integer frozen;
}
