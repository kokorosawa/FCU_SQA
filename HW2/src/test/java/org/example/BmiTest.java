package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;


class BmiTest {
    @ParameterizedTest
    @MethodSource("BmiParameter")
    void testBmi(double height,double weight, double expected) {
        Bmi bmi = new Bmi(height,weight);
        assertEquals(expected, bmi.getBmi(),0.1);
    }

    private static Stream<Arguments> BmiParameter() {
        return Stream.of(
                Arguments.of(1.7, 60, 20.7),
                Arguments.of(1.8, 70, 21.6),
                Arguments.of(1.75, 73, 23.8)
        );
    }
}