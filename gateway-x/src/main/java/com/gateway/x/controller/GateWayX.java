package com.gateway.x.controller;

import com.gateway.x.service.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private FeignClient feignClient;



    @RequestMapping("/sayHelloFeign")
    @ResponseBody
    public String sayHelloFeign(){
        return "sayHelloFeign Hello,from GateWayX" + feignClient.sayHelloFeign();
    }



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
