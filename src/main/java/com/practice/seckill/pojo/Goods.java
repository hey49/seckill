package com.practice.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * goods id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * goods name
     */
    private String goodsName;

    /**
     * goods title
     */
    private String goodsTitle;

    /**
     * goods img
     */
    private String goodsImg;

    /**
     * goods detail
     */
    private String goodsDetail;

    /**
     * goods price
     */
    private BigDecimal goodsPrice;

    /**
     * goods stock, -1 means no constraint
     */
    private Integer goodsStock;


}
