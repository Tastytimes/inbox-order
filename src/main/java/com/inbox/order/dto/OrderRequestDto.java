package com.inbox.order.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequestDto {

    private Integer id;
    private RestaurantDto restaurant;

    private List<FoodItemsDto> items;
    private Integer userId;
}
