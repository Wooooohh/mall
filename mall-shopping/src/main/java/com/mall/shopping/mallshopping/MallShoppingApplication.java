package com.mall.shopping.mallshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mall.shopping")
@SpringBootApplication
public class MallShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallShoppingApplication.class, args);
    }

}
