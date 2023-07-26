package com.ra.shop.model;

import java.util.Date;

public class Order {
    private String orderId;
    private String customerName;
    private String phone;
    private Date created;

    public Order() {
    }

    public Order(String orderId, String customerName, String phone, Date created) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.phone = phone;
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
