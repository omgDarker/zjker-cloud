package com.zjker.framework.hysyrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这个接口相当于把原来的服务提供者项目当成一个Service类
 */
@FeignClient("provider-user")
public interface HysyrixService {

    /**
     * @FeignClient(value="provider-user") 应用名称
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     * <p>
     * 定义方法，方法上部使用 @RequestMapping(value="/sayHello",method= RequestMethod.GET)
     * 映射转发请求
     **/
    @RequestMapping(value = "/provider/index", method = RequestMethod.GET)
    String sayHello();

    @RequestMapping(value = "/user/sayHi", method = RequestMethod.GET)
    String sayHi();

    @RequestMapping(value = "/user/sayHaha", method = RequestMethod.GET)
    String sayHaha();
}
