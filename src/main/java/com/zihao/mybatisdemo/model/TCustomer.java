package com.zihao.mybatisdemo.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString
public class TCustomer {
    private int customerId;
    private String customerName;

    // 一对多
    private   List<TOrder>  tOrders  = new ArrayList<TOrder>();

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<TOrder> gettOrders() {
        return tOrders;
    }

    public void settOrders(List<TOrder> tOrders) {
        this.tOrders = tOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCustomer tCustomer = (TCustomer) o;
        return customerId == tCustomer.customerId &&
                Objects.equals(customerName, tCustomer.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName);
    }


}
