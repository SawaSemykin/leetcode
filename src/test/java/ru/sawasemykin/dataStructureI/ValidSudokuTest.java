package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class ValidSudokuTest {
    private final ValidSudoku solution = new ValidSudoku();

    @ParameterizedTest
    @MethodSource("inputAndIsValidExpected")
    void isValidSudoku(char[][] board, boolean isValidExpected) {
        Assertions.assertEquals(isValidExpected, solution.isValidSudoku(board));
    }

    static Stream<Arguments> inputAndIsValidExpected() {
        return Stream.of(
                Arguments.arguments(new char[][] 
                        {
                                {'5','3','.','.','7','.','.','.','.'},
                                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
                                {'8','.','.','.','6','.','.','.','3'},
                                {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                {'.','6','.','.','.','.','2','8','.'},
                                {'.','.','.','4','1','9','.','.','5'},
                                {'.','.','.','.','8','.','.','7','9'}
                        }, true),
                Arguments.arguments(new char[][]
                        {
                                {'8','3','.','.','7','.','.','.','.'},
                                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
                                {'8','.','.','.','6','.','.','.','3'},
                                {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                {'.','6','.','.','.','.','2','8','.'},
                                {'.','.','.','4','1','9','.','.','5'},
                                {'.','.','.','.','8','.','.','7','9'}
                        }, false)
        );
    }
}
