package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Problem12 {
  public List<Integer> triangleNumbersForFirst(int number) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    for (int i = 2; i <= number; i++){
      numbers.add(numbers.get(i - 2) + i);
    }

    return numbers;
  }


  public Integer triangleNumberWithDivisorsMoreThan(int number) {

    boolean notFound = true;
    int n = 1;

    while(notFound){
      int triangleNumber = (n * (n + 1)) / 2;

      if (factorsForAnyNumber(triangleNumber) > number){
        return triangleNumber;
      }

      n = n + 1;
    }

    return 0;
  }

  public int factorsFor(int triangleNumber) {
    int count = 0;

    int end = (int) Math.sqrt(triangleNumber);
    for (int i = 1; i <= end; i++){
      if (triangleNumber % i == 0){
        count += 2;
      }
    }

    if (end * end == triangleNumber){
      count++;
    }

    return count;
  }


  public int factorsForAnyNumber(int anyNumber){
    int count = 0;
    int end = (int) Math.sqrt(anyNumber);

    for (int i = 1; i < end; i++){
      if (anyNumber % i == 0) {
        count += 2;
      }
    }

    if (end * end == anyNumber){
      count++;
    }

    return count;
  }
}
