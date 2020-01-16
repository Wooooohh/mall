package com.mall.user.malluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mall.user")
@SpringBootApplication
public class GpmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpmallUserApplication.class, args);
    }

}
