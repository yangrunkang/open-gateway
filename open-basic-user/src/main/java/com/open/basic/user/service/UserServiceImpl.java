package com.open.basic.user.service;

import com.open.spi.user.UserService;
import com.open.spi.user.req.ReadCaptchaReq;
import com.open.spi.user.req.ReadCountReq;
import com.open.spi.user.req.ReadLoginReq;
import com.open.spi.user.req.WriteRegisterReq;


/**
 * 用户服务实现类
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author runkangyang
 * @date 2019/1/3 11:37 PM
 */
public class UserServiceImpl implements UserService {

    @Override
    public Integer register(WriteRegisterReq writeRegisterReq) {
        // 1. 检查是否存在
        // 2. 发送验证内容
        return null;
    }

    @Override
    public Integer login(ReadLoginReq readLoginReq) {
        return null;
    }


    @Override
    public Integer count(ReadCountReq readCountReq) {
        return null;
    }

    @Override
    public Integer captcha(ReadCaptchaReq readCaptchaReq) {
        return null;
    }
}
