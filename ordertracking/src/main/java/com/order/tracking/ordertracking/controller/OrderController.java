package com.order.tracking.ordertracking.controller;

import com.order.tracking.ordertracking.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/order")
    public String getOrders(){
        return "Orders";
    }

    @PostMapping
    public String createOrder(@RequestBody Order order){

        return "Order created";
    }
}
