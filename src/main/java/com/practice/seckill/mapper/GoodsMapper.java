package com.practice.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.seckill.pojo.Goods;
import com.practice.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * get goods list
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * get goods detail
     * @return
     */
    GoodsVo findGoodVoByGoodsId(Long goodsId);
}
