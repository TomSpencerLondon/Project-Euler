package com.codurance;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//If we list all the natural numbers below 10 that are multiples
// of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//
// Find the sum of all the multiples of 3 or 5 below 1000.
public class Problem1 {

  public int sum(int limit) {
    List<Integer> numbers = IntStream.rangeClosed(1, limit - 1)
        .mapToObj(i -> i).collect(Collectors.toList());

    return numbers.stream()
        .filter(i -> (i % 3 == 0 || i % 5 == 0))
        .mapToInt(x -> x)
        .sum();
  }
}
