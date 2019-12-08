package com.zihao.mybatisdemo.model;

import lombok.ToString;

import java.util.Objects;

@ToString
public class TOrder {
    private int orderId;
    private String orderNo;
    private  TCustomer tCustomer;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public TCustomer gettCustomer() {
        return tCustomer;
    }

    public void settCustomer(TCustomer tCustomer) {
        this.tCustomer = tCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrder tOrder = (TOrder) o;
        return orderId == tOrder.orderId &&
                Objects.equals(orderNo, tOrder.orderNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderNo);
    }


}
