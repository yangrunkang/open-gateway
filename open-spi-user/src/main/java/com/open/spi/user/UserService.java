package com.open.spi.user;

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
     * 注册接口
     * @param writeRegisterReq
     * @return
     */
    Integer register(WriteRegisterReq writeRegisterReq);

    /**
     * 登录接口
     * @param readLoginReq
     * @return
     */
    Integer login(ReadLoginReq readLoginReq);

}
