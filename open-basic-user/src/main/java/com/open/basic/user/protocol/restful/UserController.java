package com.open.basic.user.protocol.restful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("spring.application.name")
    private String appName;

    @RequestMapping("/userApp")
    public String appName(){
        return "Restful Protocol:" + appName;
    }
}
