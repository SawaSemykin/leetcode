package ru.sawasemykin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveDuplicatesFromSortedArrayTest {

    private final ru.sawasemykin.RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @MethodSource("numsAndExpectedNums")
    void removeDuplicates(int[] nums, int[] expectedNums) {
        int k = solution.removeDuplicates(nums);
        assertEquals(expectedNums.length, k);

        for (int i = 0; i < k; i++)
            assertEquals(expectedNums[i], nums[i]);
    }

    static Stream<Arguments> numsAndExpectedNums() {
        return Stream.of(
          arguments(new int[] {1, 1, 2}, new int[] {1, 2}),
          arguments(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[] {0, 1, 2, 3, 4}),
          arguments(new int[] {1, 1, 1, 1}, new int[] {1})
        );
    }
}
