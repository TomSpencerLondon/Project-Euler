package com.codurance;

//Longest Collatz sequence
//    Problem 14
//    The following iterative sequence is
//    defined for the set of positive integers:
//
//    n → n/2 (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13,
//    we generate the following sequence:
//
//    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence
//    (starting at 13 and finishing at 1) contains 10 terms.
//    Although it has not been proved yet (Collatz Problem),
//    it is thought that all starting numbers finish at 1.
//
//    Which starting number, under one million, produces the longest chain?
//
//    NOTE: Once the chain starts the terms are
//    allowed to go above one million.

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem14Should {
  @Test
  void getsCollatzFor13() {
    Problem14 problem14 = new Problem14();

    int collatz = problem14.collatzCountFor(13);

    assertThat(collatz).isEqualTo(10);
  }

  @Test
  void largestBelow20() {
    Problem14 problem14 = new Problem14();

    int numberWithLargestCount = problem14.largestCollatzCountBelow(20);

    assertThat(numberWithLargestCount).isEqualTo(19);
  }

  @Test
  void getCollatzFor837_799() {
    Problem14 problem14 = new Problem14();

    int collatz = problem14.collatzCountFor(837_799);

    assertThat(collatz).isEqualTo(525);
  }

  @Test
  void largestCollatzBelow1_000_000() {
    Problem14 problem14 = new Problem14();

    int numberWithLargestCount = problem14.largestCollatzCountBelow(1_000_000);

    assertThat(numberWithLargestCount).isEqualTo(837_799);
  }
}
