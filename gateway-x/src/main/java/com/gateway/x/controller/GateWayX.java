package com.gateway.x.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关流量入口
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author Yangrunkang
 * @date 2019/1/4 17:58
 */

@RestController
public class GateWayX {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello,from GateWayX";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Welcome to GatewayX, Index ";
    }
}
