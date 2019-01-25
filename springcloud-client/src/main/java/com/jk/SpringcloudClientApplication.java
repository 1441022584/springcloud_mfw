package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient      // @EnableEurekaClient 表明自己是一个eurekaclient 生产者
@MapperScan("com.jk.mapper")
public class SpringcloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientApplication.class, args);
    }

}

