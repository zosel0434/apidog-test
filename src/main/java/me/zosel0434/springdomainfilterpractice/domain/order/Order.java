package me.zosel0434.springdomainfilterpractice.domain.order;

import lombok.Data;

@Data
public class Order {

  private String orderNumber;
  private OrderStatus orderStatus;
}
