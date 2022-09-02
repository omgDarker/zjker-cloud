package com.zjker.framework.provider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider02Application.class, args);
        System.out.println("---服务提供者02");
    }

}
