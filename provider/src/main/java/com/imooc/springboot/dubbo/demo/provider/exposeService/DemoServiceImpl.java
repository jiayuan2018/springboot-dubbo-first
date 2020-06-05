package com.imooc.springboot.dubbo.demo.provider.exposeService;

import com.alibaba.dubbo.config.annotation.Service;
import com.imooc.springboot.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Service(version = "0.0.1", timeout = 5000, interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {


    @Value("${server.port}")
    private String serverPort;

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (,this is from Spring Boot Provider)"+this.serverPort;
    }

}