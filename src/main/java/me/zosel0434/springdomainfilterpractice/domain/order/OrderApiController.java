package me.zosel0434.springdomainfilterpractice.domain.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/orders")
public class OrderApiController {

  @GetMapping
  public List<OrderResponse> getOrders(OrderSearchRequest request) {
    Order order1 = new Order();
    order1.setOrderNumber("12345");
    order1.setOrderStatus(OrderStatus.PENDING);

    Order order2 = new Order();
    order2.setOrderNumber("98156");
    order2.setOrderStatus(OrderStatus.CANCELED);

    return List.of(new OrderResponse(order1), new OrderResponse(order2));
  }
}
