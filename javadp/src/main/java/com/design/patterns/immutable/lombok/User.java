package com.design.patterns.immutable.lombok;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class User {

  private final Long id;

  private final String name;

}
