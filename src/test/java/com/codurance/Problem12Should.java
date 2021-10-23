package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//The sequence of triangle numbers is generated
// by adding the natural numbers.
// So the 7th triangle number would be
// 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
// The first ten terms would be:
//    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//    Let us list the factors of the first
//    seven triangle numbers:
//    1: 1
//    3: 1,3
//    6: 1,2,3,6
//    10: 1,2,5,10
//    15: 1,3,5,15
//    21: 1,3,7,21
//    28: 1,2,4,7,14,28
//    We can see that 28 is the
//    first triangle number to have over five divisors.
//
//    What is the value of the first
//    triangle number to have over five hundred divisors?
public class Problem12Should {
  @Test
  void return_first_seven_triangle_numbers() {
    final Problem12 problem12 = new Problem12();
    final List<Integer> triangleNumbers = problem12.triangleNumbersForFirst(7);

    assertThat(triangleNumbers).isEqualTo(List.of(1, 3, 6, 10, 15, 21, 28));
  }

  @Test
  void return_first_six_triangle_numbers() {
    final Problem12 problem12 = new Problem12();
    final List<Integer> triangleNumbers = problem12.triangleNumbersForFirst(6);

    assertThat(triangleNumbers).isEqualTo(List.of(1, 3, 6, 10, 15, 21));
  }

  @Test
  void return_first_eight_triangle_numbers() {
    final Problem12 problem12 = new Problem12();
    final List<Integer> triangleNumbers = problem12.triangleNumbersForFirst(8);

    assertThat(triangleNumbers).isEqualTo(List.of(1, 3, 6, 10, 15, 21, 28, 36));
  }

  @Test
  void find_first_triangle_number_with_over_five_divisors() {
    final Problem12 problem12 = new Problem12();
    Integer triangleNumber = problem12.triangleNumberWithDivisorsMoreThan(5);

    assertThat(triangleNumber).isEqualTo(28);
  }

  @Test
  void find_first_triangle_number_with_over_500_divisors() {
    final Problem12 problem12 = new Problem12();
    Integer triangleNumber = problem12.triangleNumberWithDivisorsMoreThan(500);

    assertThat(triangleNumber).isEqualTo(76_576_500);
  }

  @Test
  void factorsForSix() {
    final Problem12 problem12 = new Problem12();
    int triangleNumber = problem12.factorsFor(6);

    assertThat(triangleNumber).isEqualTo(4);
  }

  @Test
  void factorsFor3() {
    final Problem12 problem12 = new Problem12();
    int triangleNumber = problem12.factorsFor(3);

    assertThat(triangleNumber).isEqualTo(2);
  }

  @Test
  void factorsForAnyNumber() {
    final Problem12 problem12 = new Problem12();
    int triangleNumber = problem12.factorsForAnyNumber(9);

    assertThat(triangleNumber).isEqualTo(3);
  }

  @Test
  void factorsForLargeRandomNumber() {
    final Problem12 problem12 = new Problem12();
    int anyNumber = problem12.factorsForAnyNumber(100);

    assertThat(anyNumber).isEqualTo(9);
  }

  @Test
  void factorsForLargeRandom10() {
    final Problem12 problem12 = new Problem12();
    int anyNumber = problem12.factorsForAnyNumber(10);

    assertThat(anyNumber).isEqualTo(4);
  }
}
