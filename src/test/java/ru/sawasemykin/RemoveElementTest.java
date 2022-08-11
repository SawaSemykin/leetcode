package ru.sawasemykin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveElementTest {

    private final ru.sawasemykin.RemoveElement solution = new RemoveElement();

    @ParameterizedTest
    @MethodSource("numsAndExpectedNumsAndValProvider")
    void removeElement(int[] nums, int[] expectedNums, int val) {

        int k = solution.removeElement(nums, val);
        assertEquals(k, expectedNums.length);

        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++)
            assertEquals(nums[i], expectedNums[i]);
    }

    static Stream<Arguments> numsAndExpectedNumsAndValProvider() {
        return Stream.of(
                arguments(new int[] {3, 2, 2, 3}, new int[] {2, 2}, 3),
                arguments(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, new int[] {0, 0, 1, 3, 4}, 2)
        );
    }
}