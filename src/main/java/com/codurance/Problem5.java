package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
  public int smallestNumberDivisibleByNumbersFrom(List<Integer> integers) {
    boolean match = false;
    int number = 20;
    int result = 0;
    while (match != true){
      List<Integer> collection = new ArrayList<>();
      for (int n : integers) {
        if (number % n == 0){
          collection.add(n);
        }
      }
      int size = collection.size();
      if (size == 10){
        result = number;
        match = true;
      }

      number += 20;
    }
    return result;
  }

}
