package com.zjker.framework.provider01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ζδΎθ
 */
@RestController
@RequestMapping(value = "/provider")
public class Provider01Controller {

    @GetMapping(value = "/index")
    public String index(){
        return "index01";
    }
}
