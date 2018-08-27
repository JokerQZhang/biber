package com.qingdou.sc.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pc on 2018/8/27.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String testHello(String name){
        return "Hello, 你好啊："+name;
    }
}
