package ru.sawasemykin.dataStructureI.stackAndQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private final ValidParentheses solution = new ValidParentheses();

    @ParameterizedTest
    @MethodSource("stringAndExpectedResult")
    void isValid(String s, boolean isValidExpected) {
        Assertions.assertEquals(isValidExpected, solution.isValid(s));
    }

    static Stream<Arguments> stringAndExpectedResult() {
        return Stream.of(
                Arguments.arguments("()", true),
                Arguments.arguments("()[]{}", true),
                Arguments.arguments("(]", false),
                Arguments.arguments("([)]", false),
                Arguments.arguments("{[]}", true)
        );
    }
}