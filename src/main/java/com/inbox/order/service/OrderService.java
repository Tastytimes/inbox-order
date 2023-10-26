package com.inbox.order.service;

import com.inbox.order.dto.OrderDto;
import com.inbox.order.dto.OrderRequestDto;
import com.inbox.order.dto.UserDto;
import com.inbox.order.entity.Order;
import com.inbox.order.repo.OrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public String createOrder(OrderRequestDto requestMap) {
//        Integer orderId = sequenceGenerator.generatOrderId();
        UserDto userDto = fetchUser(requestMap.getUserId());
        Order order = new Order();
        order.setFoodItems(requestMap.getItems());
        order.setRestaurant(requestMap.getRestaurant());
        order.setUser(userDto);
        log.info("orders {}", order);
        orderRepo.save(order);
        return "successfully order is placed";
    }

    private UserDto fetchUser(Integer id) {
        UserDto optionalUser = restTemplate.getForObject("http://USERS-SERVICE/user/user/"+ id, UserDto.class);
        return  optionalUser;
    }
}
