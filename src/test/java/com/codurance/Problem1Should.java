package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Should {
  @Test
  void sum_multiples_of_three_or_five_below_4() {
    final Problem1 problem1 = new Problem1();

    final int sum = problem1.sum(4);

    assertThat(sum).isEqualTo(3);
  }

  @Test
  void sum_multiples_of_three_or_five_below_6() {
    final Problem1 problem1 = new Problem1();

    final int sum = problem1.sum(6);

    assertThat(sum).isEqualTo(8);
  }

  @Test
  void sum_multiples_of_three_or_five_below_7() {
    final Problem1 problem1 = new Problem1();

    final int sum = problem1.sum(7);

    assertThat(sum).isEqualTo(14);
  }

  @Test
  void sum_233168_for_multiples_of_three_and_five_below_1000() {
    final Problem1 problem1 = new Problem1();

    final int sum = problem1.sum(1000);

    assertThat(sum).isEqualTo(233168);
  }
}
