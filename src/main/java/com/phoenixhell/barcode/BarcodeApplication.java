package com.phoenixhell.barcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.phoenixhell.barcode.Mapper")
public class BarcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarcodeApplication.class, args);
    }

}
