package me.zosel0434.springdomainfilterpractice.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum UserStatus {

  ACTIVE("활성화"),
  INACTIVE("비활성화"),
  ;

  private final String description;
}
