package com.zihao.mybatisdemo.mapper;

import com.zihao.mybatisdemo.model.TStudent;
import com.zihao.mybatisdemo.vo.StudentVo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentMapper {

    int add(TStudent student);

    int edit(TStudent student);

    int del(TStudent student);

    TStudent load(TStudent student);

    List<TStudent>  getAll(TStudent student);

    List<TStudent>  getAlls(StudentVo studentVo);

}
