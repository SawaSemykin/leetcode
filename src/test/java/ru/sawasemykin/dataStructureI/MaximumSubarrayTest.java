package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumSubarrayTest {
    private final MaximumSubarrayDivideAndConquer divideAndConquerSolution = new MaximumSubarrayDivideAndConquer();
    private final MaximumSubarray sequentialSolution = new MaximumSubarray();

    @ParameterizedTest
    @MethodSource("numsAndSum")
    void maxSubArray(int[] nums, int sum) {
        assertEquals(sum, divideAndConquerSolution.maxSubArray(nums));
        assertEquals(sum, sequentialSolution.maxSubArray(nums));
    }

    static Stream<Arguments> numsAndSum() {
        return Stream.of(
                arguments(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                arguments(new int[] {1}, 1),
                arguments(new int[] {5, 4, -1, 7, 8}, 23),
                arguments(new int[] {1, 2}, 3),
                arguments(new int[] {-1, -2}, -1),
                arguments(new int[] {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4}, 6),
                arguments(new int[] {-1, -1, -2, -2}, -1)
        );
    }
}