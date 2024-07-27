package com.order.tracking.ordertracking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order")
public class Order {
    @Id
    private String orderId;
    private String orderPrice;
    private String status;

    public Order() {
    }

    public Order(String orderId, String orderPrice, String status) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
