package com.codurance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem6 {
  public Integer sumOfSquares(List<Integer> naturals) {
    AtomicInteger sum = new AtomicInteger();
    naturals.forEach((n) -> {
      sum.addAndGet(n * n);
    });

    return sum.get();
  }

  public Integer squareOfSum(List<Integer> naturals) {
    return (int) Math.pow(naturals.stream().reduce(0, (a, b) -> a + b), 2);
  }

  public int diffOfSumOfSquaresAndSquareOfSum(List<Integer> naturals) {
    final Integer squareOfSum = squareOfSum(naturals);
    final Integer sumOfSquares = sumOfSquares(naturals);

    return squareOfSum - sumOfSquares;
  }
}
