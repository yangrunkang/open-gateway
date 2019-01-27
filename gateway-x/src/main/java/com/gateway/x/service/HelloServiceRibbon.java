package com.gateway.x.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 通过之前注入ioc容器的restTemplate来消费服务的接口，在这里我们直接用的程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 *
 * @author runkangyang
 * @date 1/27/19 00:37
 */
@Service
public class HelloServiceRibbon {
    /**
     * 通过之前注入ioc容器的restTemplate来消费服务接口
     */
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") // 熔断器
    public String hiService(String name) {
        return restTemplate.getForObject("http://open-basic-user/hi?name=" + name, String.class);
    }

    /**
     * 熔断方法
     *
     * @param name
     * @return
     */
    public String hiError(String name) {
        return "[HelloServiceRibbon]hi," + name + ",sorry,error!";
    }



}
