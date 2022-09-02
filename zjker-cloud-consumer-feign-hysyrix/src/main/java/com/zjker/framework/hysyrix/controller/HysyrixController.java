package com.zjker.framework.hysyrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zjker.framework.hysyrix.service.HysyrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 */
@RestController
public class HysyrixController {

    @Autowired
    private HysyrixService hysyrixService;

    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     */
    @GetMapping("/consumer/hello")
    @HystrixCommand(fallbackMethod = "helloFailback") // 失败时调用默认返回
    public String index() {
        return hysyrixService.sayHello();
    }

    @GetMapping("/hi")
    public String hi() {
        return hysyrixService.sayHi();
    }

    @GetMapping("/haha")
    public String haha() {
        return hysyrixService.sayHaha();
    }

    /**
     *
     *  对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
     * @return 失败调用时，返回默认值:
     */
    public String helloFailback(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx";
    }
}
