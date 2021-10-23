package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem2Should {
  @Test
  void sum_even_valued_Fibonacci_terms_up_to_9() {
    final Problem2 problem2 = new Problem2();
    final Long result = problem2.sumEvensTo(9L);
    assertThat(result).isEqualTo(10L);
  }

  @Test
  void sum_even_valued_Fibonacci_terms_up_to_four_million() {
    final Problem2 problem2 = new Problem2();
    final Long result = problem2.sumEvensTo(4_000_000L);
    assertThat(result).isEqualTo(4613732L);
  }
}
