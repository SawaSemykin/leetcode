package ru.sawasemykin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PlusOneTest {
    private final PlusOne solution = new PlusOne();

    @ParameterizedTest
    @MethodSource("inputAndOutput")
    void plusOne(int[] input, int[] expectedOutput) {
        int[] output = solution.plusOne(input);

        assertEquals(expectedOutput.length, output.length);

        for (int i = 0; i < expectedOutput.length; i++)
            assertEquals(expectedOutput[i], output[i]);
    }

    static Stream<Arguments> inputAndOutput() {
        return Stream.of(
                arguments(new int[] {1}, new int[] {2}),
                arguments(new int[] {1, 2, 3}, new int[] {1, 2, 4}),
                arguments(new int[] {4, 3, 2, 1}, new int[] {4, 3, 2, 2}),
                arguments(new int[] {0}, new int[] {1}),
                arguments(new int[] {9}, new int[] {1, 0}),
                arguments(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 1}),
                arguments(new int[] {8, 9, 9, 9}, new int[] {9, 0, 0, 0})
        );
    }
}