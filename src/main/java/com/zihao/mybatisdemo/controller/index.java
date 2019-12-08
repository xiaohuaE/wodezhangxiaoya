package com.zihao.mybatisdemo.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

    @RequestMapping("/")
    public String la(){
        System.out.println("----------------------A-------------------------------");
        return  "login";
    }
}
