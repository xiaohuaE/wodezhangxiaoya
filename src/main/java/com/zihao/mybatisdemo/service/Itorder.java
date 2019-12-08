package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.model.TCustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Itorder {

    public List<TOrder> Get(@Param("heman") Map<String,Object> heman);

}
