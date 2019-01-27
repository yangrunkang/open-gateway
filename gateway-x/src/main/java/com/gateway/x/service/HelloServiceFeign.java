package com.gateway.x.service;

import com.gateway.x.service.hystric.HelloServiceFeignHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "open-basic-user", fallback = HelloServiceFeignHystric.class)
public interface HelloServiceFeign {
    /**
     * /hi  是 basic-user-user 里面的
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hiFeign(@RequestParam(value = "name") String name);
}
