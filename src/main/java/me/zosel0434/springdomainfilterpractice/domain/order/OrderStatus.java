package me.zosel0434.springdomainfilterpractice.domain.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OrderStatus {

  PENDING("대기"),
  CANCELED("취소"),
  ;

  private final String description;
}
