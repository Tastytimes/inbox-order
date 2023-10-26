package com.inbox.order.entity;

import com.inbox.order.dto.FoodItemsDto;
import com.inbox.order.dto.RestaurantDto;
import com.inbox.order.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection ="order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String  id;
    private List<FoodItemsDto> foodItems;
    private RestaurantDto restaurant;
    private UserDto user;


}
