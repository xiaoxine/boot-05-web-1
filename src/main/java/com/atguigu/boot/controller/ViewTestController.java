package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: long
 *@CreateTime: 2022-10-17  19:48
 *@Description: controller
 *@Version: 1.0
 */
@Controller
public class ViewTestController {
    @GetMapping("/atguigu")
    public String atguigu(Model model){

        //model中的数据会被放在请求域中 request.setAttribute（＂a＂，aa）
        model.addAttribute("msg","你好 guigu");
        model.addAttribute("link","http://www.baidu.com");

        return "success";
    }
}
