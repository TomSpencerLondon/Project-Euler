package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Problem13 {
  private final String input;

  public Problem13(String input) {
    this.input = input;
  }

  public List<List<Integer>> nestedArray() {
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < 100; i++){
      List<Integer> line = new ArrayList<>();
      for (int j = 0; j < 50; j++){
        final int number = parseInt(String.valueOf(input.charAt((i * 50) + j)));
        line.add(number);
      }
      result.add(line);
    }

    return result;
  }

  public Long sumOfColumnFrom(List<List<Integer>> lists) {
      StringBuilder finalResult = new StringBuilder();
      int carry = 0;
      for (int i = 50 - 1; i >= 0; i--){
        int toAppend = 0;
        int result = 0;
        result += carry;
        carry = 0;
        for (int j = 0; j < 100; j++){
          result += lists.get(j).get(i);
        }
        if (i > 0){
          toAppend = result % 10;
          carry = (result - toAppend) / 10;
        } else {
          final String firstDigits = new StringBuilder(String.valueOf(result)).reverse().toString();
          toAppend = parseInt(firstDigits);
        }

        finalResult.append(toAppend);
      }

    String reversedSum = finalResult.reverse().toString();
    StringBuilder answer = new StringBuilder();
    for (int k = 0; k < 10; k++) {
      answer.append(reversedSum.charAt(k));
    }

    return Long.parseLong(answer.toString());
  }
}
