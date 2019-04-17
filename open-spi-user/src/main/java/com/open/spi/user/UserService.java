package com.open.spi.user;

import com.open.spi.user.req.ReadCountReq;
import com.open.spi.user.req.ReadLoginReq;
import com.open.spi.user.req.WriteRegisterReq;

/**
 * 用户服务
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author runkangyang
 * @date 2019/1/3 11:34 PM
 */
public interface UserService {

    /**
     * 注册接口(email,phone两种注册方式)
     * @param writeRegisterReq
     * @return
     */
    Integer register(WriteRegisterReq writeRegisterReq);

    /**
     * 登录接口(email,phone两种注册方式)
     * @param readLoginReq
     * @return
     */
    Integer login(ReadLoginReq readLoginReq);

    /**
     * 检测用户是否存在(email,phone两个验证方式)
     *
     * @param readCountReq
     * @return
     */
    Integer count(ReadCountReq readCountReq);
}
