package ru.sawasemykin.dataStructureI.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @ParameterizedTest
    @MethodSource("sAndTAndIsAnagramExpected")
    void isAnagram(String s, String t, boolean isAnagramExpected) {
        Assertions.assertEquals(isAnagramExpected, solution.isAnagram(s, t));
    }

    static Stream<Arguments> sAndTAndIsAnagramExpected() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "car", false),
                arguments("aacc", "ccac", false)
        );
    }
}
