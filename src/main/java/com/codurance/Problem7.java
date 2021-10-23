package com.codurance;

import java.util.ArrayList;

public class Problem7 {
  public int findPrime(int index) {
    final ArrayList<Integer> primes = new ArrayList<>();
    int count = 0;
    int number = 2;
    while(count != index) {
      if(isPrime(number)){
        primes.add(number);
        count++;
      }
      number++;
    }

    return primes.get(index - 1);
  }

  public boolean isPrime(int number){
    if (number <= 1){
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++){
      if (number % i == 0){
        return false;
      }
    }

    return true;
  }
}
