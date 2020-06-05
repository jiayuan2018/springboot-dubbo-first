package com.imooc.springboot.dubbo.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.imooc.springboot.dubbo.demo.consumer.controller")
@Slf4j
public class MainConsumer {

    public static void main(String[] args) {

        try{
            SpringApplication.run(MainConsumer.class,args);
        }catch (Exception e){
            log.error(e.getMessage());
        }


    }

}