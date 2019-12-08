package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TSysUser;
import org.hibernate.boot.model.relational.Namespace;
import org.junit.Test;

import javax.annotation.Resource;
import javax.xml.soap.Name;

import java.util.Set;

import static org.junit.Assert.*;

public class UserImplTest extends BaseTest {

    @Resource
    private  Iuser iuser;

    @Test
    public void select_name() {
        TSysUser ar = iuser.select_name("admin");
          System.out.println(ar);
    }

    @Test
    public void test() {
     Set<String> s =  iuser.getjiaose("admin");
        for (String a : s){
            System.out.println(a);
        }
    }

    @Test
    public void test2() {
        Set<String> s =  iuser.getquanx("admin");
        for (String a : s){
            System.out.println(a);
        }
    }


}