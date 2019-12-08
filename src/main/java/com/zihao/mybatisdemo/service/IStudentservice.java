package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TStudent;
import com.zihao.mybatisdemo.util.PageBean;
import com.zihao.mybatisdemo.vo.StudentVo;

import java.util.List;

public interface IStudentservice {

    int add(TStudent stu);

    TStudent load(TStudent stu);

    int del(TStudent stu);

    int edit(TStudent stu);

    List<TStudent> getAll(TStudent stu);

    List<TStudent> getallsPaging(StudentVo stu , PageBean pageBean);


}
