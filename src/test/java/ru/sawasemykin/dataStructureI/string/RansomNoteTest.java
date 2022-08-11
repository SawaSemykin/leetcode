package ru.sawasemykin.dataStructureI.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RansomNoteTest {
    private final RansomNote solution = new RansomNote();

    @ParameterizedTest
    @MethodSource("firstStrAndSecondStrAndExpectedResult")
    void canConstruct(String ransomNote, String magazine, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, solution.canConstruct(ransomNote, magazine));
    }

    static Stream<Arguments> firstStrAndSecondStrAndExpectedResult() {
        return Stream.of(
                arguments("a", "b", false),
                arguments("aa", "ab", false),
                arguments("aa", "aab", true),
                arguments("fihjjjjei", "hjibagacbhadfaefdjaeaebgi", false)
        );
    }
}