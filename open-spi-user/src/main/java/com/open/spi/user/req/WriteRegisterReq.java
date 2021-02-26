package com.open.spi.user.req;

import java.io.Serializable;

/**
 * Description: 提供两种注册方式
 * 1. 手机号 + 密码 + 验证码
 * 2. 邮箱 + 密码 + 验证码
 *
 * All rights Reserved, Designed By HQYG
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/4/10 16:29
 */
public class WriteRegisterReq implements Serializable {

    private String phone;

    private String password;

    private String repeatedPassword;

    private String email;

}
