package com.evan.junit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FooTest {

  @Test
  void should_return_bar() {
    var foo = new Foo();
    assertThat(foo.get()).isEqualTo("bar");
  }
}