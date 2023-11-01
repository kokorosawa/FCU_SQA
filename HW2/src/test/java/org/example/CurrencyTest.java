package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {
  @ParameterizedTest
  @MethodSource("CurrencyParameter")
  void testCurrency(Currency currency1, Currency currency2, int expected) {
    currency1 = currency1.add(currency2);
    assertEquals(expected, currency1.getAmount());
  }

  private static Stream<Arguments> CurrencyParameter() {
    return Stream.of(
            Arguments.of(new Currency(1000, "NT"), new Currency(30, "US"), 1900),
            Arguments.of(new Currency(500, "NT"), new Currency(30, "NT"), 530),
            Arguments.of(new Currency(10, "US"), new Currency(600, "NT"), 30),
            Arguments.of(new Currency(10, "US"), new Currency(10, "US"), 20)
    );
  }
}