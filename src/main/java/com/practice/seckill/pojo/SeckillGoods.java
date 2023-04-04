package com.practice.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_seckill_goods")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * seckill goods id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * goods id
     */
    private Long goodsId;

    /**
     * seckill price
     */
    private BigDecimal seckillPrice;

    /**
     * stock count
     */
    private Integer stockCount;

    /**
     * seckill start time
     */
    private Date startDate;

    /**
     * seckill end time
     */
    private Date endDate;


}
