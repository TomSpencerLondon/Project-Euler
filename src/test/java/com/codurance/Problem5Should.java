package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem5Should {
//  Problem 5
//      2520 is the smallest number that can be divided
//      by each of the numbers from 1 to 10 without any remainder.
//
//  What is the smallest positive number that is evenly divisible
//  by all of the numbers from 1 to 20?


  @Test
  void finds_smallest_number_evenly_divisible_by_1_to_10() {
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Problem5 problem5 = new Problem5();

    int result = problem5.smallestNumberDivisibleByNumbersFrom(integers);

    assertThat(result).isEqualTo(2520);
  }

  @Test
  void finds_smallest_number_evenly_divisible_by_1_to_20() {
    List<Integer> integers = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    Problem5 problem5 = new Problem5();

    int result = problem5.smallestNumberDivisibleByNumbersFrom(integers);

    assertThat(result).isEqualTo(232792560);
  }
}
