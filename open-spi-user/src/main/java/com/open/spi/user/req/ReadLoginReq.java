package com.open.spi.user.req;

import java.io.Serializable;

/**
 * Description: 登录方式
 *
 * 1. 手机号 + 验证码/密码
 * 2. 邮箱 + 密码
 * All rights Reserved, Designed By HQYG
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/4/10 16:36
 */
public class ReadLoginReq implements Serializable {

    private String phone;

    private String verifiCode;

    private String password;

    private String email;

}
