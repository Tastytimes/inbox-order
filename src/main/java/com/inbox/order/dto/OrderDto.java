package com.inbox.order.dto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private RestaurantDto restaurant;

    private List<FoodItemsDto> items;
    private UserDto userDto;
}
