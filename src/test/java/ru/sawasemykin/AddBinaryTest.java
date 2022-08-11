package ru.sawasemykin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class AddBinaryTest {
    private final AddBinary solution = new AddBinary();

    @ParameterizedTest
    @MethodSource("aAndBAndExpectedResult")
    void addBinary(String a, String b, String expectedResult) {
        String result = solution.addBinary(a, b);
        Assertions.assertTrue(expectedResult.equals(result));
    }

    static Stream<Arguments> aAndBAndExpectedResult() {
        return Stream.of(
                arguments("11", "1", "100"),
                arguments("1010", "1011", "10101")
        );
    }
}