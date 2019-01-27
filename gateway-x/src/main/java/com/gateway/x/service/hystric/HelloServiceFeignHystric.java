package com.gateway.x.service.hystric;

import com.gateway.x.service.HelloServiceFeign;
import org.springframework.stereotype.Component;

/**
 * 熔断类实现响应需要熔断的接口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 *
 * @author runkangyang
 * @date 1/27/19 13:12
 */
@Component
public class HelloServiceFeignHystric implements HelloServiceFeign {

    @Override
    public String hiFeign(String name) {
        return "[HelloServiceFeignHystric] hi," + name + ",sorry,error!";
    }
}
