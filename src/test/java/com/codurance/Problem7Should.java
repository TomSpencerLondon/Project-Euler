package com.codurance;
//
// 10_001st prime
// Problem 7
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
// we can see that the 6th prime is 13.
//    What is the 10 001st prime number?

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem7Should {
  @Test
  void finds_6th_prime_number() {
    final Problem7 problem7 = new Problem7();
    final int prime = problem7.findPrime(6);
    assertThat(prime).isEqualTo(13);
  }

  @Test
  void finds_10_001st_prime_number() {
    final Problem7 problem7 = new Problem7();
    final int prime = problem7.findPrime(10_001);
    assertThat(prime).isEqualTo(104_743);
  }

  @Test
  void isPrime_worksFor13() {
    final Problem7 problem7 = new Problem7();
    final boolean prime = problem7.isPrime(13);
    assertTrue(prime);
  }
}
