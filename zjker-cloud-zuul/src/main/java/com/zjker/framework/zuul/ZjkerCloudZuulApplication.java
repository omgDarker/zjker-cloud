package com.zjker.framework.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZjkerCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjkerCloudZuulApplication.class, args);
    }

}
