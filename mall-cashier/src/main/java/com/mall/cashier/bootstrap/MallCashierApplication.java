package com.mall.cashier.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mall.cashier")
@SpringBootApplication
public class MallCashierApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCashierApplication.class, args);
    }

}
