package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.DemoService;

@SpringBootApplication
public class ShardingJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShardingJdbcDemoApplication.class, args);
        applicationContext.getBean(DemoService.class).demo();
    }
}

