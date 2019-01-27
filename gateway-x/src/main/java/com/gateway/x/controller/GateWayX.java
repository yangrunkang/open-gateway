package com.gateway.x.controller;

import com.gateway.x.service.HelloServiceFeign;
import com.gateway.x.service.HelloServiceRibbon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 网关流量入口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author Yangrunkang
 * @date 2019/1/4 17:58
 */

@RestController
public class GateWayX {

    @Resource
    private HelloServiceRibbon helloService;

    @Resource
    private HelloServiceFeign helloServiceFeign;

    /**
     * 通过服务注册中心调用服务
     * http://localhost:8764/hiFromBasicUserService?name=yrk123
     */
    @GetMapping(value = "/hiFromBasicUserServiceRibbon")
    public String hiRibbon(@RequestParam String name) {
        return helloService.hiService(name);
    }

    /**
     * http://localhost:8764/hiFromBasicUserServiceFeign?name=forezp33
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hiFromBasicUserServiceFeign")
    public String hiFeign(@RequestParam String name) {
        return helloServiceFeign.hiFeign(name);
    }
}
