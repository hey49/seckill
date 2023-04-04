package com.practice.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    SUCCESS(200, "SUCCESS"),
    ERROR(500, "Server Error"),

    // login 5002xx
    LOGIN_ERROR(500210, "Username or password incorrect"),
    MOBILE_ERROR(500211, "Wrong phone number"),
    BIND_ERROR(500212, "Parameter test exception"),
    MOBILE_NOT_EXIST(500213, "No phone number"),
    PASSWORD_UPDATE_FAIL(500214, "fail to update password"),
    SESSION_ERROR(500215, "no user"),

    //seckill 5005xx
    EMPTY_STOCK(500500, "No enough storage"),
    REPEAT_ERROR(500501, "You can only buy one"),

    // order 5003xx
    ORDER_NOT_EXIST(500300, "no this order"),
    ;

    private final Integer code;
    private final String message;
}
