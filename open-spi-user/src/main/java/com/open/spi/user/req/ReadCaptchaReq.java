package com.open.spi.user.req;

import java.io.Serializable;

/**
 * Description:验证输入的验证信息是否正确
 * All rights Reserved, Designed By HQYG
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/4/17 17:05
 */
public class ReadCaptchaReq implements Serializable {


    private String captcha;

    private String email;

    private String phone;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
