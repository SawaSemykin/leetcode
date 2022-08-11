package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Search2DMatrixTest {
    private final Search2DMatrix solution = new Search2DMatrix();

    @ParameterizedTest
    @MethodSource("matrixAndTargetAndSearchedExpected")
    void searchMatrix(int[][] matrix, int target, boolean searchedExpected) {
        Assertions.assertEquals(searchedExpected, solution.searchMatrix(matrix, target));
    }

    static Stream<Arguments> matrixAndTargetAndSearchedExpected() {
        return Stream.of(
                Arguments.arguments(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3, true),
                Arguments.arguments(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13, false),
                Arguments.arguments(new int[][] {{1}}, 0, false)
        );
    }
}
