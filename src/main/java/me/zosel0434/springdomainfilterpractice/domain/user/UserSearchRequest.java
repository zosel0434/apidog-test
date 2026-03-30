package me.zosel0434.springdomainfilterpractice.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserSearchRequest {

  private String name;
  private UserStatus userStatus;
}
