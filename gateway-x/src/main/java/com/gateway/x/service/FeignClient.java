package com.gateway.x.service;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "open-basic-user")
public interface FeignClient {

    @RequestMapping("/sayHello")
    String sayHelloFeign();

}