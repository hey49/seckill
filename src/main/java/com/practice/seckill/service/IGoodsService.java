package com.practice.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.seckill.pojo.Goods;
import com.practice.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
public interface IGoodsService extends IService<Goods> {

    /**
     * get goods list
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * get goods detail
     * @param goodsId
     * @return
     */
    GoodsVo findGoodVoByGoodsId(Long goodsId);
}
