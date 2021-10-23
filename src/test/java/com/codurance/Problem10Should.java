package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem10Should {
  @Test
  void sumOfPrimesBelow10() {
    final Problem10 problem10 = new Problem10();
    String sum = problem10.sumOfPrimesBelow(10);

    assertThat(sum).isEqualTo("17");
  }

  @Test
  void sumOfPrimesBelow2_000_000() {
    final Problem10 problem10 = new Problem10();
    String sum = problem10.sumOfPrimesBelow(2_000_000);

    assertThat(sum).isEqualTo("142913828922");
  }

  @Test
  void checkForPrimeFor5() {
    final Problem10 problem10 = new Problem10();
    final boolean prime = problem10.isPrime(5);

    assertTrue(prime);
  }
}
