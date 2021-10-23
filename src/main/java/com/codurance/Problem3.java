package com.codurance;

public class Problem3 {
  public Long largestPrime(Long number){
    while (true) {
      Long smallestFactor = smallestFactor(number);
      if (smallestFactor < number){
        number = number / smallestFactor;
      }else {
        return number;
      }
    }
  }

  private Long smallestFactor(Long number){
    if (number <= 1){
      throw new IllegalArgumentException();
    }

    for (Long i = 2L; i <= Math.sqrt(number); i++){
      if (number % i == 0){
        return i;
      }
    }

    return number;
  }
}
