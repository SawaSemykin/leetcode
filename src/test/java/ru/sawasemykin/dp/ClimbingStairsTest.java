package ru.sawasemykin.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class ClimbingStairsTest {
    private final ClimbingStairs solution = new ClimbingStairs();

    @ParameterizedTest
    @MethodSource("inAndOut")
    void climbStairs(int n, int expectedWaysCount) {
        Assertions.assertEquals(expectedWaysCount, solution.climbStairs(n));
    }

    static Stream<Arguments> inAndOut() {
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 3)
        );
    }
}