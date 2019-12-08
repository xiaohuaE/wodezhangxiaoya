package com.zihao.mybatisdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/he")
    public  String  hello(String name){
        System.out.println("-------------------------------xhn-----------------------");
        return  "demo";
    }
}
//forward:/WEB-INF/jsp/demo.jsp