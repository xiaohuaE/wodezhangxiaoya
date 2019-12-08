package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.Tcustomer;
import com.zihao.mybatisdemo.model.TCustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TCustomerImpl implements Itcustomer {

    @Resource
    private Tcustomer tcustomer;

    @Override
    public List<TCustomer> Get(Map<String, Object> ddmap) {
        return tcustomer.Get(ddmap);
    }
}
