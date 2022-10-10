package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: long
 *@CreateTime: 2022-10-10  12:58
 *@Description: 控制
 *@Version: 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/bug.jpg")
    public String hello(){

        return "aaa";
    }


}
