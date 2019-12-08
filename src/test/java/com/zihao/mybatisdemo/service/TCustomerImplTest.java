package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.Tcustomer;
import com.zihao.mybatisdemo.model.TCustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TCustomerImplTest extends BaseTest {

    @Resource
    private  Itcustomer itcustomer;

    @Test
    public void get() {
        Map<String,Object>  ar = new HashMap<>();
       // ar.put("name","z");
        List<TCustomer>  rc =  itcustomer.Get(ar);
        for(TCustomer aa : rc){
            System.out.println(aa);
            System.out.println("---------------------------------");
            for(TOrder bb: aa.gettOrders()){
                System.out.println(bb);
            }

        }

    }
}