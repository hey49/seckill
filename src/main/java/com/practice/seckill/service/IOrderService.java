package com.practice.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.seckill.pojo.Order;
import com.practice.seckill.pojo.User;
import com.practice.seckill.vo.GoodsVo;
import com.practice.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
public interface IOrderService extends IService<Order> {

    /**
     * seckill
     * @param user
     * @param goods
     * @return
     */
    Order seckill(User user, GoodsVo goods);

    /**
     * order detail
     * @param orderId
     * @return
     */
    OrderDetailVo detail(Long orderId);
}
