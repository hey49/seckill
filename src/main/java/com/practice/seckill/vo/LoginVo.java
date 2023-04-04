package com.practice.seckill.vo;

import com.practice.seckill.validator.IsMobile;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * login parameters
 */
@Data
public class LoginVo {

    // use validator to validate the input
    @NotNull
    @IsMobile
    private String mobile;
    @NotNull
    @Length(min=32)
    private String password;
}
