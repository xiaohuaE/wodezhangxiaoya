package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Iduo {

    public List<TNews> getAll(@Param("ran") Map<String,Object>ran);

}
