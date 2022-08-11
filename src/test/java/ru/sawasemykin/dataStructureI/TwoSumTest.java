package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumTest {
    private final TwoSumBruteForce bruteForceSolution = new TwoSumBruteForce();
    private final TwoSum hasMapSolution = new TwoSum();

    @ParameterizedTest
    @MethodSource("numsAndTargetAndExpectedOutputAsc")
    void twoSum(int[] nums, int target, int[] expectedOutputAsc) {
        int[] actualOutput = bruteForceSolution.twoSum(nums, target);
        int[] actualOutput1 = hasMapSolution.twoSum(nums, target);
        assertEquals(2, actualOutput.length);
        assertEquals(2, actualOutput1.length);
        Arrays.sort(actualOutput);
        Arrays.sort(actualOutput1);
        for (int i = 0; i < actualOutput.length; i++) {
                assertEquals(expectedOutputAsc[i], actualOutput[i]);
                assertEquals(expectedOutputAsc[i], actualOutput1[i]);
        }
    }

    static Stream<Arguments> numsAndTargetAndExpectedOutputAsc() {
        return Stream.of(
                arguments(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
                arguments(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
                arguments(new int[] {3, 3}, 6, new int[] {0, 1})
        );
    }
}
