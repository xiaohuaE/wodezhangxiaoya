package com.zihao.mybatisdemo.mapper;

import com.zihao.mybatisdemo.model.TCustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Tcustomer {

    public List<TCustomer> Get(@Param("ddmap") Map<String,Object> ddmap);

}
