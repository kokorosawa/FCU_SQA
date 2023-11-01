package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TomorrowTest {
  @ParameterizedTest
  @MethodSource("TomorrowParameter")
  void testTomorrow(int year, int month, int date, String expected) {
    Tomorrow tomorrow = new Tomorrow(year, month, date);
    assertEquals(expected, tomorrow.getTomorrow());
  }

  private static Stream<Arguments> TomorrowParameter() {
    return Stream.of(
            Arguments.of(2023, 1, 1, "2023-01-02"),
            Arguments.of(2023, 1, 31, "2023-02-01"),
            Arguments.of(2023, 2, 28, "2023-03-01"),
            Arguments.of(2023, 3, 31, "2023-04-01"),
            Arguments.of(2023, 4, 30, "2023-05-01"),
            Arguments.of(2023, 5, 31, "2023-06-01")
    );
  }
}