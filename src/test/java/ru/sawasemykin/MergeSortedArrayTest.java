package ru.sawasemykin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeSortedArrayTest {
    private final MergeSortedArray solution = new MergeSortedArray();

    @ParameterizedTest
    @MethodSource("num1AndMAndNums2AndNAndExpectedNums")
    void merge(int[] nums1, int m, int[] nums2, int n, int[] expectedNums) {
        solution.merge(nums1, m, nums2, n);
        Assertions.assertEquals(expectedNums.length, nums1.length);
        for (int i = 0; i < nums1.length; i++)
            Assertions.assertEquals(expectedNums[i], nums1[i]);
    }

    static Stream<Arguments> num1AndMAndNums2AndNAndExpectedNums() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3, new int[] {1, 2, 2, 3, 5, 6}),
                arguments(new int[] {1}, 1, new int[0], 0, new int[] {1}),
                arguments(new int[] {0}, 0, new int[] {1}, 1, new int[] {1}),
                arguments(new int[] {1, 2, 4, 5, 6, 0}, 5, new int[] {3}, 1, new int[] {1, 2, 3, 4, 5, 6}),
                arguments(new int[] {-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[] {1, 2, 2}, 3, new int[] {-1, 0, 0, 1, 2, 2, 3, 3, 3})
        );
    }
}