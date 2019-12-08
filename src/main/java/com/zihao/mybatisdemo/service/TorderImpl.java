package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.Order;
import com.zihao.mybatisdemo.mapper.Tcustomer;
import com.zihao.mybatisdemo.model.TOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TorderImpl implements Itorder {

    @Resource
    private Order order;

    @Override
    public List<TOrder> Get(Map<String, Object> heman) {
        return order.Get(heman);
    }
}
