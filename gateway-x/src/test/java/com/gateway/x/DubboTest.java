package com.gateway.x;

import com.alibaba.dubbo.config.annotation.Reference;
import com.open.spi.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboTest {
    
    @Reference(url = "dubbo://127.0.0.1:20880")
    private UserService userService;
    
    @Test
    public void testSayHello(){
        String s1 = userService.sayHello();
        System.out.println(s1);
    }
    
    
}
