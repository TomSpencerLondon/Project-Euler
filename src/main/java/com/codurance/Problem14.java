package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Problem14 {
  public int collatzCountFor(int number) {
    long currentNumber = number;
    int count = 1;
    while(currentNumber > 1){
      if (isEven(currentNumber)){
        currentNumber /= 2;
        count++;
      }else {
        currentNumber = (currentNumber * 3) + 1;
        count++;
      }
    }

    return count;
  }

  private boolean isEven(long currentNumber) {
    return currentNumber % 2 == 0;
  }

  public int largestCollatzCountBelow(int input) {
    int numberWithLargestCount = 0;
    int maxCount = Integer.MIN_VALUE;
    for (int i = input; i > input / 2; i--){
      final int collatzForCurrentNumber = collatzCountFor(i);
      if (collatzForCurrentNumber > maxCount){
        maxCount = collatzForCurrentNumber;
        numberWithLargestCount = i;
      }
    }
    return numberWithLargestCount;
  }
}
