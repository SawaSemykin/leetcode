package ru.sawasemykin.dataStructureI.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class FirstUniqueCharacterInAStringTest {
    private final FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();

    @ParameterizedTest
    @MethodSource("stringAndExpectedIndex")
    void firstUniqueChar(String s, int expectedIndex) {
        Assertions.assertEquals(expectedIndex, solution.firstUniqueChar(s));
    }

    static Stream<Arguments> stringAndExpectedIndex() {
        return Stream.of(
                arguments("leetcode", 0),
                arguments("loveleetcode", 2),
                arguments("aabb", -1)
        );
    }
}