package com.codurance;

//A Pythagorean triplet is a set of three natural numbers,
// a < b < c, for which,
//    a2 + b2 = c2
//    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//    There exists exactly one Pythagorean triplet
//    for which a + b + c = 1000.
//    Find the product abc.
// 1. Pythagorean triplet = 3^2 + 4^2 = 5^2 or
// Pythagorean triplet = 200^2 + 375^2 = 425^2

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem9Should {
  @Test
  void find_triplet_for_numbers_adding_to_12() {
    final Problem9 problem9 = new Problem9();
    final String product = problem9.findPythagoreanTripletProductFor(12);
    assertThat(product).isEqualTo("60");
  }

  @Test
  void find_triplet_for_numbers_adding_to_1000() {
    final Problem9 problem9 = new Problem9();
    final String product = problem9.findPythagoreanTripletProductFor(1_000);
    assertThat(product).isEqualTo("31875000");
  }
}
