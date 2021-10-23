package com.codurance;

public class Problem9 {
  public String findPythagoreanTripletProductFor(int number) {
    final int range = number / 2;

    for (int a = 1; a < range; a++){
      for (int b = a + 1; b < range; b++){
        int c = number - a - b;
        if (arePythagorean(a, b, c)){
          final int product = a * b * c;
          return Integer.toString(product);
        }
      }
    }
    throw new AssertionError("Not found");
  }

  private boolean arePythagorean(int a, int b, int c) {
    return a * a + b * b == c * c;
  }
}
