package com.zihao.mybatisdemo.controller;

import com.zihao.mybatisdemo.model.TOrder;
import com.zihao.mybatisdemo.model.TStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class studentController {

    //在读取controller的时候 提前加载  每个req方法加载一次  就会运行一次
    @ModelAttribute(value = "sr")
    public List<String> str() {
        List<String> sr = Arrays.asList("一", "二", "三", "四");
        //model.addAttribute("sr",str);
        return sr;
    }


    @RequestMapping("/save")
    public String save(@Validated(value = TStudent.ValidGroup.Add.class) @ModelAttribute("student") TStudent student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("验证失败");
            return "add";
        }
        System.out.println("---------------------" + student);
        //   model.addAttribute("torder",new TOrder());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new TStudent());
        System.out.println("----------------add-----------------");
        return "add";
    }


}
