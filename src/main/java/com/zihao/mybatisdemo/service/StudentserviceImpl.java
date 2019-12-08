package com.zihao.mybatisdemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zihao.mybatisdemo.mapper.StudentMapper;
import com.zihao.mybatisdemo.model.TStudent;
import com.zihao.mybatisdemo.util.PageBean;
import com.zihao.mybatisdemo.vo.StudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentserviceImpl implements IStudentservice {

    @Resource
    private StudentMapper studentMapper;


    @Override
    public int add(TStudent stu) {
        return studentMapper.add(stu);
    }

    @Override
    public TStudent load(TStudent stu) {
        return studentMapper.load(stu);
    }

    @Override
    public int del(TStudent stu) {
        return studentMapper.del(stu);
    }

    @Override
    public int edit(TStudent stu) {
        return studentMapper.edit(stu);
    }

    @Override
    public List<TStudent> getAll(TStudent stu) {
        return studentMapper.getAll(stu);
    }

    @Override
    public List<TStudent> getallsPaging(StudentVo stu , PageBean pageBean) {
              List<TStudent>  lst =  studentMapper.getAlls(stu);
        return lst;
    }

}
