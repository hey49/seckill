package com.practice.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.seckill.pojo.SeckillOrder;
import com.practice.seckill.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    /**
     * get seckill result
     * @param user
     * @param goodsId
     * @return orderId: success, -1: fail, 0: queueing
     */
    Long getResult(User user, Long goodsId);
}
