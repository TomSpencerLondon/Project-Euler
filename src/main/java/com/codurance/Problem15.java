package com.codurance;

import java.math.BigInteger;

import static com.codurance.Factorial.factorial;

public class Problem15 {
  public BigInteger findRoutesCount(int N, int K) {
    BigInteger result = BigInteger.ONE;

    for (int k = 0; k < K; k++){
      result = result.multiply(BigInteger.valueOf(N - k))
          .divide(BigInteger.valueOf(k + 1));
    }

    return result;
  }

  public BigInteger findRoutesCountBigInteger(int N, int K){
    final BigInteger totalSteps = factorial(N);
    final BigInteger duplicateSteps = factorial(K).multiply(factorial(K));
    return totalSteps.divide(duplicateSteps);
  }
}
