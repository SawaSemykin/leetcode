package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class IntersectionOfTwoArraysIITest {
    private final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();

    @ParameterizedTest
    @MethodSource("nums1AndNums2AndExpectedIntersect")
    void intersect(int[] nums1, int[] nums2, int[] expectedIntersect) {
        int[] actualIntersect = solution.intersect(nums1, nums2);
        Assertions.assertEquals(expectedIntersect.length, actualIntersect.length);
        Arrays.sort(expectedIntersect);
        Arrays.sort(actualIntersect);
        for (int i = 0; i < actualIntersect.length; i++)
            Assertions.assertEquals(expectedIntersect[i], actualIntersect[i]);
    }

    static Stream<Arguments> nums1AndNums2AndExpectedIntersect() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 1}, new int[] {2, 2}, new int[] {2, 2}),
                arguments(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}, new int[] {4, 9}),
                arguments(new int[] {1, 2}, new int[] {1, 1}, new int[] {1})
        );
    }
}
