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
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * order id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * user id
     */
    private Long userId;

    /**
     * goods id
     */
    private Long goodsId;

    /**
     * delivery address id
     */
    private Long deliveryAddrId;

    /**
     * redundant goods name
     */
    private String goodsName;

    /**
     * goods count
     */
    private Integer goodsCount;

    /**
     * goods price
     */
    private BigDecimal goodsPrice;

    /**
     * 1pc, 2android, 3ios
     */
    private Integer orderChannel;

    /**
     * 0not pay, 1paid, 2sent, 3delivered, 4refunded, 5finished
     */
    private Integer status;

    /**
     * order create time
     */
    private Date createDate;

    /**
     * pay time
     */
    private Date payDate;


}
