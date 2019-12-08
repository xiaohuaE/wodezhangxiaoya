package com.zihao.mybatisdemo.mapper;

import com.zihao.mybatisdemo.model.TNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface duoduiduo {

    public  List<TNews> getAll(@Param("ran")Map<String , Object> ran);

}
