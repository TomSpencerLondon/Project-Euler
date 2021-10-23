package com.codurance;

public class Problem4 {
  public boolean isPalindrome(int number) {
    int original = number;
    int remainder = 0;
    int reversed = 0;
    while (number != 0) {
      remainder = number % 10;
      reversed = reversed * 10 + remainder;
      number /= 10;
    }

    return original == reversed;
  }

  public int maxPalindrome(int digits) {
    int maxPalindrome = -1;
    int start = (int) Math.pow(10, digits - 1);
    int limit = (int) Math.pow(10, digits);

    for (int i = limit; i > start; i--){
      for (int j = limit; j > start; j--){
        int product = i * j;
        if (isPalindrome(product) && product > maxPalindrome) {
          maxPalindrome = product;
        }
      }
    }

    return maxPalindrome;
  }
}
