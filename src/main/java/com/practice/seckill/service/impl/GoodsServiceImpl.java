package com.practice.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.seckill.mapper.GoodsMapper;
import com.practice.seckill.pojo.Goods;
import com.practice.seckill.service.IGoodsService;
import com.practice.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    /**
     * get goods list
     * @return
     */
    @Override
    public List<GoodsVo> findGoodsVo() {
        return goodsMapper.findGoodsVo();
    }

    /**
     * get goods detail
     * @param goodsId
     * @return
     */
    @Override
    public GoodsVo findGoodVoByGoodsId(Long goodsId) {
        return goodsMapper.findGoodVoByGoodsId(goodsId);
    }
}
