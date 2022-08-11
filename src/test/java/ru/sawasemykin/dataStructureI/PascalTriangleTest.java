package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    private final PascalTriangle solution = new PascalTriangle();

    @ParameterizedTest
    @MethodSource("numRowsAndExpectedTriangle")
    void generate(int numRows, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.generate(numRows);
        Assertions.assertTrue(expected.equals(actual));
    }

    static Stream<Arguments> numRowsAndExpectedTriangle() {
        return Stream.of(
                Arguments.arguments(1, Arrays.asList(Arrays.asList(1))),
                Arguments.arguments(2, Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1))),
                Arguments.arguments(3, Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1))),
                Arguments.arguments(4, Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1),
                        Arrays.asList(1, 3, 3, 1)))
        );
    }
}