package me.zosel0434.springdomainfilterpractice.domain.order;

import lombok.Getter;

@Getter
public class OrderResponse {

  private String orderNumber;
  private OrderStatus orderStatus;

  public OrderResponse(Order order) {
    this.orderNumber = order.getOrderNumber();
    this.orderStatus = order.getOrderStatus();
  }
}
