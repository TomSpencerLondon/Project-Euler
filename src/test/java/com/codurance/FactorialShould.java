package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialShould {
  @Test
  void return_one_for_one() {
    final Factorial factorial = new Factorial();
    int result = factorial.add(1);
    assertThat(result).isEqualTo(1);
  }

  @Test
  void return_two_for_two() {
    final Factorial factorial = new Factorial();
    int result = factorial.add(2);
    assertThat(result).isEqualTo(2);
  }

  @Test
  void return_six_for_three() {
    final Factorial factorial = new Factorial();
    int result = factorial.add(3);
    assertThat(result).isEqualTo(6);
  }
}
