package com.evan.junit;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FooParameterizedTest {

  @ParameterizedTest
  @ValueSource(strings = {"", "  "})
  void should_return_true_when_null_or_blank_strings(String input) {
    assertThat(Strings.isBlank(input)).isTrue();
  }
}
