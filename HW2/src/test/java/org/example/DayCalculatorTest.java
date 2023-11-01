package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;


class DayCalculatorTest {
  @ParameterizedTest
  @CsvFileSource(resources = "/testdata.csv", numLinesToSkip = 1)
  void DayCalculatorTest(int month, int date, int expected) {
    DayCalculator dayCalculator = new DayCalculator(month, date);
    assertEquals(expected, dayCalculator.getDayOfWeek());
  }
}