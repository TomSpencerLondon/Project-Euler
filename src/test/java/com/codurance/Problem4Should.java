package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem4Should {
//  A palindromic number reads the same both ways.
//  The largest palindrome made from the product of
//    two 2-digit numbers is 9009 = 91 × 99.
//
//  Find the largest palindrome made from the product of two 3-digit numbers.
  // 1. Check if a number is palindrome
  // 2. multiply two numbers - starting from largest possible eg.
  // 999 * 999
  // Decrease the numbers


  @Test
  void returns_true_for_9009_is_palindrome() {
    final Problem4 problem4 = new Problem4();
    assertTrue(problem4.isPalindrome(9009));
  }

  @Test
  void largestPalindrome_for_two_digits() {
    final Problem4 problem4 = new Problem4();
    assertThat(problem4.maxPalindrome(2)).isEqualTo(9009);
  }

  @Test
  void largestPalindrome_for_three_digits() {
    final Problem4 problem4 = new Problem4();
    assertThat(problem4.maxPalindrome(3)).isEqualTo(906609);
  }
}
