package com.codurance;

import java.util.List;

public class Problem11 {
  private final List<List<Integer>> numbers;
  private int productCount = 4;

  public Problem11(List<List<Integer>> numbers) {
    this.numbers = numbers;
  }

  public Long largestProduct() {
    long product = 0L;

    for (int col = 0; col < this.numbers.size(); col++){
      for (int row = 0; row < this.numbers.get(0).size(); row++){
        long tempProduct;

        if (row < numbers.size() - productCount){
          tempProduct = numbers.get(col).get(row);
          for (int v = 1; v < productCount; v++){
            tempProduct *= this.numbers.get(col).get(row + v);
          }
          product = Math.max(product, tempProduct);
        }

        if (col < numbers.size() - productCount){
          tempProduct = numbers.get(col).get(row);

          for (int h = 1; h < productCount; h++){
            tempProduct *= this.numbers.get(col + h).get(row);
          }
          product = Math.max(product, tempProduct);
        }

        if (col < numbers.size() - productCount && row >= productCount){
          tempProduct = numbers.get(col).get(row);

          for (int dfu = 1; dfu < productCount; dfu++){
            tempProduct *= this.numbers.get(col + dfu).get(row - dfu);
          }
          product = Math.max(product, tempProduct);
        }

        if (row < numbers.size() - productCount && col < numbers.get(0).size() - productCount){
          tempProduct = numbers.get(col).get(row);

          for (int dfd = 1; dfd < productCount; dfd++){
            tempProduct *= this.numbers.get(col + dfd).get(row + dfd);
          }
          product = Math.max(product, tempProduct);
        }
      }
    }
    return product;
  }
}
