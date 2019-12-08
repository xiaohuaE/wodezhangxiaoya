package com.zihao.mybatisdemo.mapper;

import com.zihao.mybatisdemo.model.TSysUser;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface User {

    /**
     *  根据用户名获取用户信息
     * @param name
     * @return
     */
    TSysUser select_name(@Param("name") String name);


    /**
     *  通过用户名称获取角色的信息
     *  连表
     */
    Set<String> getjiaose(@Param("names") String names);

    /**
     * 通过用户名称获取权限信息
     */
    Set<String>  getquanx(@Param("names2") String names2);




}
