package com.ra.shop.service.impl;

import com.ra.shop.data.Database;
import com.ra.shop.model.OrderDetail;
import com.ra.shop.model.Product;
import com.ra.shop.service.GenericService;
import com.ra.shop.util.Predicate;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailServiceImpl implements GenericService<OrderDetail, String> {
    @Override
    public List<OrderDetail> findAll() {
        return Database.orderDetails;
    }

    @Override
    public List<OrderDetail> findBy(Predicate<OrderDetail> predicate) {
        List<OrderDetail> searchResult = new ArrayList<>();
        for (OrderDetail od : Database.orderDetails) {
            if (predicate.test(od)) {
                searchResult.add(od);
            }
        }
        return searchResult;
    }

    @Override
    public OrderDetail findId(String id) {
        return null;
    }

    @Override
    public void add(OrderDetail item) {
        Database.orderDetails.add(item);
    }

    @Override
    public void edit(OrderDetail item) {
        Predicate<OrderDetail> predicate = x -> x.getOrderId().equals(item.getOrderId()) && x.getProductId().equals(item.getProductId());
        OrderDetail od = findBy(predicate).get(0);
        od.setQuantity(item.getQuantity());
    }

    @Override
    public void remove(String id) {
        List<OrderDetail> od = findBy(x -> x.getOrderId().equals(id));
        Database.orderDetails.removeAll(od);
    }
}
