package com.codurance;

import java.math.BigInteger;

public class Factorial {
  public int add(int input) {
    if (input == 1) {
      return 1;
    }

    return input * add(input - 1);
  }

  public static BigInteger factorial(int n){
    if (n < 0){
      throw new IllegalArgumentException("Factorial of negative number");
    }

    BigInteger prod = BigInteger.ONE;

    for(int i = 2; i <= n; i++){
      prod = prod.multiply(BigInteger.valueOf(i));
    }

    return prod;
  }
}
