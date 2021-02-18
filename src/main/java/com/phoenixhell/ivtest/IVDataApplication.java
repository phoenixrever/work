package com.phoenixhell.ivtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.phoenixhell.ivtest.Mapper")
public class IVDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(IVDataApplication.class, args);
    }

}
