package com.codurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
  public Long sumEvensTo(Long limit) {
    final List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);

    int i = 2;
    while ((integers.get(i - 1) + integers.get(i - 2)) < limit){
      integers.add(integers.get(i - 1) + integers.get(i - 2));
      i++;
    };

    return Long.valueOf(integers.stream()
        .filter(x -> x % 2 == 0)
        .reduce(0, (a, b) -> a + b));
  }
}
