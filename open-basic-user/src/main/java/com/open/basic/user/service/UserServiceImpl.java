package com.open.basic.user.service;

import com.open.spi.user.UserService;
import org.springframework.stereotype.Component;

/**
 * 用户服务实现类
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author runkangyang
 * @date 2019/1/3 11:37 PM
 */
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "Hello, I am from open-basic-user";
    }
}
