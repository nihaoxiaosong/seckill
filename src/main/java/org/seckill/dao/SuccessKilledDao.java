package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by song on 16/8/13.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细,可过滤重复
     * @param seckilled
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckilled, long userPhone);

    /**
     * 根据 id 查询SuccessKilled 并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
