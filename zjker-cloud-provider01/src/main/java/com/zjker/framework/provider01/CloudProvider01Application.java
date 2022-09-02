package com.zjker.framework.provider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider01Application.class, args);
        System.out.println("---服务提供者");
    }

}
