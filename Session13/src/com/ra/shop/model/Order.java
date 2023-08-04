package com.ra.shop.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderId;
    private String employeeId;
    private String tableId;
    private Date created;

    public Order() {
    }

    public Order(String orderId, String employeeId, String tableId, Date created) {
        this.orderId = orderId;
        this.employeeId = employeeId;
        this.tableId = tableId;
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
