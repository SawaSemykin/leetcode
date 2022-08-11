package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeTheMatrixTest {
    private final ReshapeTheMatrix solution = new ReshapeTheMatrix();

    @ParameterizedTest
    @MethodSource("matAndRAndCAndExpectedMat")
    void matrixReshape(int[][] mat, int r, int c, int[][] expectedMat) {
        int[][] actualSolution = solution.matrixReshape(mat, r, c);
        Assertions.assertEquals(expectedMat.length, actualSolution.length);
        Assertions.assertEquals(expectedMat[0].length, actualSolution[0].length);
        Arrays.deepEquals(expectedMat, actualSolution);
    }

    static Stream<Arguments> matAndRAndCAndExpectedMat() {
        return Stream.of(
                Arguments.arguments(new int[][] {{1, 2}, {3, 4}}, 1, 4, new int[][] {{1, 2, 3, 4}}),
                Arguments.arguments(new int[][] {{1, 2}, {3, 4}}, 2, 4, new int[][] {{1, 2}, {3, 4}})
        );
    }
}