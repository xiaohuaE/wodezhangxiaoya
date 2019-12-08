package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TSysUser;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface Iuser {

    /**
     * 根据用户姓名查询用户所以信息
     * @param name
     * @return
     */
    TSysUser select_name(String name);

    /**
     * 根据用户名称查到用户角色信息
     * @param names
     * @return
     */
    Set<String> getjiaose(String names);


    /**
     * 根据用户名查询道用户权限信息
     * @param names2
     * @return
     */
    Set<String>  getquanx(String names2);

}
