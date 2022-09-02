package com.zjker.framework.feign.controller;

import com.zjker.framework.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     */
    @GetMapping("/consumer/hello")
    public String index(){
        return feignService.sayHello();
    }

    @GetMapping("/hi")
    public String hi(){
        return feignService.sayHi();
    }

    @GetMapping("/haha")
    public String haha(){
        return feignService.sayHaha();
    }

}
