package com.zihao.mybatisdemo.controller;

import com.zihao.mybatisdemo.model.TSysUser;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Userrealm {

    @RequestMapping("/user/denlu")
    public String denlu(TSysUser user, Model model) {
        System.out.println("1");

        //获取核心
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());

        try {
            subject.login(token);
        } catch (AuthenticationException ex) {
            model.addAttribute("message", "用户密码错误");
            return "login";
        }

        return "index";
    }

}
