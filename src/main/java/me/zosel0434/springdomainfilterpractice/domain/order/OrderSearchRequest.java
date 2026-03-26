package me.zosel0434.springdomainfilterpractice.domain.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class OrderSearchRequest {

  private String orderNumber;
  private OrderStatus orderStatus;
}
