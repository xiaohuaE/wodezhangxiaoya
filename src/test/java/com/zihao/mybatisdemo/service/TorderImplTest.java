package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TOrder;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TorderImplTest extends BaseTest {

    @Resource
    private  Itorder itorder;

    @Test
    public void get() {
        Map<String,Object> ar = new HashMap<>();
        ar.put("la",1);
              List<TOrder> sr = itorder.Get(ar);
              for(TOrder s :sr){
                  System.out.println(s);
              }

    }
}