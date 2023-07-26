package com.ra.shop.service.impl;

import com.ra.shop.data.Database;
import com.ra.shop.model.Order;
import com.ra.shop.model.OrderDetail;
import com.ra.shop.service.GenericService;
import com.ra.shop.util.Predicate;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements GenericService<Order, String> {
    @Override
    public List<Order> findAll() {
        return Database.orders;
    }

    @Override
    public List<Order> findBy(Predicate<Order> predicate) {
        List<Order> searchResult = new ArrayList<>();
        for (Order od : Database.orders) {
            if (predicate.test(od)) {
                searchResult.add(od);
            }
        }
        return searchResult;
    }

    @Override
    public Order findId(String id) {
        return Database.orders.stream()
                .filter(x -> x.getOrderId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Order item) {
        Database.orders.add(item);
    }

    @Override
    public void edit(Order item) {
        Order o = findId(item.getOrderId());
        o.setCustomerName(item.getCustomerName());
        o.setPhone(item.getPhone());
    }

    @Override
    public void remove(String id) {
        Order o = findId(id);
        Database.orders.remove(o);
    }
}
