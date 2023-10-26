package com.inbox.order.dto;

import lombok.Data;

@Data
public class FoodItemsDto {
    private Integer id;
    private String itemName;
    private String description;
    private boolean veg;
    private Number price;
    private Integer restaurant;
    private Integer quantity;
}
