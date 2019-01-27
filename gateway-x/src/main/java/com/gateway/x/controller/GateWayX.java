package com.gateway.x.controller;

import com.gateway.x.service.HelloServiceFeign;
import com.gateway.x.service.HelloServiceRibbon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 网关流量入口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author Yangrunkang
 * @date 2019/1/4 17:58
 *
 * 开启更新机制:@RefreshScope
 */

@RestController
@RefreshScope
public class GateWayX {

    @Resource
    private HelloServiceRibbon helloService;

    @Resource
    private HelloServiceFeign helloServiceFeign;

    /**
     * 通过服务注册中心调用服务
     * http://localhost:8764/hiFromBasicUserServiceRibbon?name=hiFromBasicUserServiceRibbon
     */
    @GetMapping(value = "/hiFromBasicUserServiceRibbon")
    public String hiRibbon(@RequestParam String name) {
        return helloService.hiService(name);
    }

    /**
     * http://localhost:8764/hiFromBasicUserServiceFeign?name=hiFromBasicUserServiceFeign
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hiFromBasicUserServiceFeign")
    public String hiFeign(@RequestParam String name) {
        return helloServiceFeign.hiFeign(name);
    }

    @Value("${appTest}")
    String appTest;

    @GetMapping(value = "config")
    public String getAppConfigDefault() {
        return appTest;
    }




}
