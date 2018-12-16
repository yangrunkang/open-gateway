package com.open.gateway.opengateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenGateWay {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello from open-gateway";
    }

}
