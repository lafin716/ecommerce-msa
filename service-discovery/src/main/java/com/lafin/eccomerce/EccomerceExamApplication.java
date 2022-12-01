package com.lafin.eccomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EccomerceExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(EccomerceExamApplication.class, args);
    }

}
