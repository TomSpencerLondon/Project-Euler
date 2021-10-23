package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem3Should {
//  Problem 3
//  The prime factors of 13195 are 5, 7, 13 and 29.
//
//  What is the largest prime factor of the number 600851475143 ?


  @Test
  void LargestPrime_for_48_is_3() {
    final Problem3 problem3 = new Problem3();
    final Long number = problem3.largestPrime(48L);
    assertThat(number).isEqualTo(3L);
  }

  @Test
  void largestPrime_for_29_is_29() {
    final Problem3 problem3 = new Problem3();
    final Long number = problem3.largestPrime(29L);
    assertThat(number).isEqualTo(29L);
  }

  @Test
  void finds_prime_factors_for_13195() {
    final Problem3 problem3 = new Problem3();
    final Long number = problem3.largestPrime(13195L);
    assertThat(number).isEqualTo(29L);
  }

  @Test
  void finds_prime_factors_for_600851475143() {
    final Problem3 problem3 = new Problem3();
    final Long number = problem3.largestPrime(600851475143L);
    assertThat(number).isEqualTo(6857L);
  }
}
