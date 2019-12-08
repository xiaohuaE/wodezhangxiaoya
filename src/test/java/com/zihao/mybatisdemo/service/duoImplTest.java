package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TNews;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


public class duoImplTest extends BaseTest {

    @Resource
    private  Iduo iduo;

    @Test
    public void getAll() {

        Map<String,Object> ar = new HashMap<>();
        ar.put("xin",1);
        List<TNews> sr = iduo.getAll(ar);
        for(TNews ss : sr){
            System.out.println(ss);
        }

    }
}