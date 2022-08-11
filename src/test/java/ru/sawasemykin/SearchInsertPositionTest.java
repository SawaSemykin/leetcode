package ru.sawasemykin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SearchInsertPositionTest {
    private final SearchInsertPosition solution = new SearchInsertPosition();

    @ParameterizedTest
    @MethodSource("numsAndTargetAndExpectedOutputIdx")
    void searchInsert(int[] nums, int target, int expectedOutputIdx) {
        int outputIdx = solution.searchInsert(nums, target);
        assertEquals(expectedOutputIdx, outputIdx);
    }

    static Stream<Arguments> numsAndTargetAndExpectedOutputIdx() {
        return Stream.of(
                arguments(new int[] {1, 3, 5, 6}, 5, 2),
                arguments(new int[] {1, 3, 5, 6}, 2, 1),
                arguments(new int[] {1, 3, 5, 6}, 7, 4),
                arguments(new int[] {1, 3, 5, 6}, -1, 0)
        );
    }
}