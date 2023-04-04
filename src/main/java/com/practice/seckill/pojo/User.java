package com.practice.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id phone number
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass+salt)+salt)
     */
    private String password;

    private String salt;

    /**
     * PROFILE
     */
    private String head;

    /**
     * register date
     */
    private Date registerData;

    /**
     * last login date
     */
    private Date lastLoginDate;

    /**
     * login count
     */
    private Integer loginCount;


}
