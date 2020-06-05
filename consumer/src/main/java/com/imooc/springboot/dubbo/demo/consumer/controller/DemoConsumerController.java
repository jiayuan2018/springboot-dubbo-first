package com.imooc.springboot.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DemoConsumerController {

    @Reference(version="0.0.1", timeout = 5000, check= false)
    private DemoService demoService;


    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(required =true) String name) {

        String param = name+" T ";

        return this.demoService.sayHello(name);
    }

}