package me.zosel0434.springdomainfilterpractice.domain.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.zosel0434.springdomainfilterpractice.domain.user.UserSearchRequest;

@NoArgsConstructor
@Getter
public class OrderSearchRequest {

  private String orderNumber;
  private OrderStatus orderStatus;

  private UserSearchRequest userSearchRequest;
}
