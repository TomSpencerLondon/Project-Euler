package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Problem6Should {
  @Test
  void findSumOfSquaresOfFirstTenNaturalNumbers() {
    final Problem6 problem6 = new Problem6();
    List<Integer> naturals = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    final Integer result = problem6.sumOfSquares(naturals);

    assertThat(result).isEqualTo(385);
  }

  @Test
  void squareOfSumOfFirstTenNaturalNumbers() {
    final Problem6 problem6 = new Problem6();
    List<Integer> naturals = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    final Integer result = problem6.squareOfSum(naturals);

    assertThat(result).isEqualTo(3025);
  }

  @Test
  void differenceBetweenSumOfSquaresAndSquareOfSumOfFirstTenNaturalNumbers() {
    final Problem6 problem6 = new Problem6();
    List<Integer> naturals = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    final int result = problem6.diffOfSumOfSquaresAndSquareOfSum(naturals);

    assertThat(result).isEqualTo(2640);
  }

  @Test
  void differenceBetweenSumOfSquaresAndSquareOfSumOfFirst100NaturalNumbers() {
    final Problem6 problem6 = new Problem6();
    List<Integer> naturals = IntStream.rangeClosed(1, 100)
        .boxed().collect(Collectors.toList());

    final int result = problem6.diffOfSumOfSquaresAndSquareOfSum(naturals);

    assertThat(result).isEqualTo(25_164_150);
  }
}
