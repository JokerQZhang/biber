package com.qingdou.sc.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pc on 2018/8/27.
 */
@Controller
public class HelloConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/chello")
    public String getFromRegister(){
        String result = restTemplate.getForObject("http://system-server/hello?name=heiheihei", String.class);
        return "获取到的结果是：" + result;
    }
}
