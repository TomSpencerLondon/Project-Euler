package com.codurance;

public class Factorial {
  public int add(int input) {
    if (input == 1) {
      return 1;
    }

    return input * add(input - 1);
  }
}
