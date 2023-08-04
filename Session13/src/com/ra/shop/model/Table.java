package com.ra.shop.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Table implements Serializable {
    private static final long serialVersionUID = 1L;

    private String tableId;
    private boolean status;

    transient private List<OrderDetail> orders = new ArrayList<>();

    public Table() {
    }

    public void addOrder(OrderDetail item) {
        boolean isDuplicate = false;
        for (OrderDetail od : orders) {
            if(od.getProductId().equals(item.getProductId())) {
                od.setQuantity(item.getQuantity());
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate)
            orders.add(item);
    }
    public void removeOrder(String productId) {
        orders.removeIf(x -> x.getProductId().equals(productId));
    }

    public List<OrderDetail> getOrders() {
        return this.orders;
    }

    public void removeAll() {
        this.orders = new ArrayList<>();
    }

    public Table(String tableId, boolean status) {
        this.tableId = tableId;
        this.status = status;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
