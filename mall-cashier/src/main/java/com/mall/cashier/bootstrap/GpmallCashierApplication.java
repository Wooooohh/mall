package com.mall.cashier.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mall.cashier")
@SpringBootApplication
public class GpmallCashierApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpmallCashierApplication.class, args);
    }

}
