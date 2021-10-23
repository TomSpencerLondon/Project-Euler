package com.codurance;

public class Problem10 {
  public String sumOfPrimesBelow(int number) {
    long sum = 2L;

    for (int i = 3; i < number; i += 2){
      if (isPrime(i)){
        sum += i;
      }
    }
    return String.valueOf(sum);
  }

  public boolean isPrime(int number){
    for (int i = 2; i <= Math.sqrt(number); i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
}
