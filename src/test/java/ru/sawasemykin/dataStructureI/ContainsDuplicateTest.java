package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private final ContainsDuplicate solution = new ContainsDuplicate();

    @ParameterizedTest
    @MethodSource("inputAndOutput")
    void containsDuplicate(int[] nums, boolean duplicateFound) {
        Assertions.assertEquals(duplicateFound, solution.containsDuplicate(nums));
    }

    static Stream<Arguments> inputAndOutput() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 3, 1}, true),
                Arguments.arguments(new int[] {1, 2, 3, 4}, false),
                Arguments.arguments(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }
}