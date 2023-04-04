package com.practice.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.seckill.pojo.User;
import com.practice.seckill.vo.LoginVo;
import com.practice.seckill.vo.RespBean;
import com.practice.seckill.vo.RespBeanEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2023-02-22
 */
public interface IUserService extends IService<User> {

    /**
     * login
     * @param loginVo
     * @return
     */

    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * get user from cookie
     * @param userTicket
     * @return
     */
    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);


    /**
     * update password
     * @param userTicket
     * @param password
     * @param request
     * @param response
     * @return
     */
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
