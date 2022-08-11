package ru.sawasemykin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciNumberTest {
    private final FibonacciNumber solution = new FibonacciNumber();

    @ParameterizedTest
    @MethodSource("nAndFn")
    void fib(int n, int fn) {
        Assertions.assertEquals(fn, solution.fib(n));
    }

    static Stream<Arguments> nAndFn() {
        return Stream.of(
                arguments(0, 0),
                arguments(1, 1),
                arguments(2, 1),
                arguments(3, 2),
                arguments(4, 3),
                arguments(5, 5),
                arguments(6, 8),
                arguments(7, 13)
        );
    }
}