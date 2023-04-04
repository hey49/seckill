package com.practice.seckill.utils;

import java.util.UUID;

/**
 * UUID utility
 *
 * @ClassName: UUIDUtil
 */
public class UUIDUtil {

    public static String uuid() {

        return UUID.randomUUID().toString().replace("-", "");
    }
}
