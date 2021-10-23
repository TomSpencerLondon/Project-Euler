package com.codurance;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Problem15Should {
  @Test
  void find_routes_through_2_by_2_grid() {
    final Problem15 problem15 = new Problem15();

    final BigInteger routesCount = problem15.findRoutesCount(4, 2);

    assertThat(routesCount).isEqualTo(new BigInteger("6"));
  }

  @Test
  void find_routes_through_20_by_20_grid() {
    final Problem15 problem15 = new Problem15();

    final BigInteger routesCount = problem15.findRoutesCount(40, 20);

    assertThat(routesCount).isEqualTo(new BigInteger("137846528820"));
  }

  @Test
  void find_routes_bigInteger_through_2_by_2() {
    final Problem15 problem15 = new Problem15();

    final BigInteger routesCount = problem15.findRoutesCountBigInteger(4, 2);

    assertThat(routesCount).isEqualTo(new BigInteger("6"));
  }

  @Test
  void find_routes_bigInteger_through_20_by_20() {
    final Problem15 problem15 = new Problem15();

    final BigInteger routesCount = problem15.findRoutesCountBigInteger(40, 20);

    assertThat(routesCount).isEqualTo(new BigInteger("137846528820"));
  }
}
