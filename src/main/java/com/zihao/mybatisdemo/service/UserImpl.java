package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.User;
import com.zihao.mybatisdemo.model.TSysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class UserImpl implements Iuser {

    @Resource
    private User user;

    @Override
    public TSysUser select_name(String name) {
        return user.select_name(name);
        }

    @Override
    public Set<String> getjiaose(String names) {
        return user.getjiaose(names);
    }

    @Override
    public Set<String> getquanx(String names2) {
        return user.getquanx(names2);
    }
}
