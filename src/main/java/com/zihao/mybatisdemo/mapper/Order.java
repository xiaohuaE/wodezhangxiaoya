package com.zihao.mybatisdemo.mapper;

import com.zihao.mybatisdemo.model.TCustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Order {

    public List<TOrder> Get(@Param("heman") Map<String,Object>  heman);

}
