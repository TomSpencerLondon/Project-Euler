package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
  private final String longNumber;
  List<Integer> productNumbers = new ArrayList<>();

  public Problem8(String longNumber) {
    this.longNumber = longNumber;
  }

  public long findLargestProductFor(int numberOfDigits) {
    final List<String> split = List.of(longNumber.split(""));
    long product = 0;

    setInitialProductNumbers(numberOfDigits);
    List<Integer> tempProductNumbers = setTempProductNumbers(numberOfDigits);

    for (int i = 0; i < split.size() - numberOfDigits; i++) {
      long temp = 1;

      for (int j = 0; j < numberOfDigits; j++) {
        int digit = Integer.parseInt(split.get(i + j));
        temp *= digit;
        tempProductNumbers.set(j, digit);
      }

      if (temp > product) {
        product = temp;
        for(int k = 0; k < numberOfDigits; k++) {
          productNumbers.set(k, tempProductNumbers.get(k));
        }
      }
    }

    return product;
  }
  
  private List<Integer> setTempProductNumbers(int numberOfDigits) {
    List<Integer> tempProductNumbers = new ArrayList<>();
    for (int a = 0; a < numberOfDigits; a++) {
      tempProductNumbers.add(0);
    }
    return tempProductNumbers;
  }

  private void setInitialProductNumbers(int numberOfDigits) {
    for (int a = 0; a < numberOfDigits; a++) {
      productNumbers.add(0);
    }
  }
}
