package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.Tcustomer;
import com.zihao.mybatisdemo.model.TCustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface Itcustomer {

   public  List<TCustomer>  Get(@Param("ddmap") Map<String,Object>ddmap);

}
