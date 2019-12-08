package com.zihao.mybatisdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    //获取配置的上传路径
     @Value("${uploadDir}")
    private String uploadDir;

    @RequestMapping("/sys/uploadpage")
    public String upload() {

        return "uploadpage";
    }

    @RequestMapping("/sys/shangchuan")
    public String shangcuan(MultipartFile img) throws IOException {
        String path = uploadDir + File.separator + System.currentTimeMillis();
        File file = new File(path);
        String fn = img.getOriginalFilename();
        System.out.println("上传的文件" + fn);
        img.transferTo(file);
        return "redirect:uploadpage";
    }
}
