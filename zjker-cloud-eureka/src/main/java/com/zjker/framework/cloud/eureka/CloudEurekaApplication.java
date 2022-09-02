package com.zjker.framework.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务发现
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
        System.out.println("---服务监控访问地址" + "http://localhost:8888");
    }

}
