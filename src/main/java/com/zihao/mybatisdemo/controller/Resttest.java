package com.zihao.mybatisdemo.controller;

import com.zihao.mybatisdemo.model.TStudent;
import com.zihao.mybatisdemo.service.IStudentservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Resttest {

    @Resource
    public IStudentservice studentservice;

    @RequestMapping("/rest/getAll")
    public Object getAll(TStudent student) {
        TStudent stu = studentservice.load(student);
        System.out.println(stu);
        return stu;
    }

}
