package com.example.develog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class DevelogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelogApplication.class, args);
    }

}
