package com.inbox.order.controller;

import com.inbox.order.dto.OrderDto;
import com.inbox.order.dto.OrderRequestDto;
import com.inbox.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody OrderRequestDto requestMap){
        String a = orderService.createOrder(requestMap);
        return  new ResponseEntity<>(a, HttpStatus.CREATED);
    }
}
