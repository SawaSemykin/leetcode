package ru.sawasemykin.dataStructureI;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    private final int BOARD_SIZE = 9;
    private final int SUB_BOX_SIZE = 3;

    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = new HashSet<>(BOARD_SIZE);
        Set<Character> columnSet = new HashSet<>(BOARD_SIZE);
        Set<Character> subBoxSet = new HashSet<>(BOARD_SIZE);
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !columnSet.add(board[j][i]))
                    return false;
                if (i % SUB_BOX_SIZE == 0 && j % SUB_BOX_SIZE == 0 && !isValidSubBox(board, i, j, subBoxSet))
                    return false;
            }
            rowSet.clear();
            columnSet.clear();
        }
        return true;
    }

    private boolean isValidSubBox(char[][] board, int topRow, int leftCol, Set<Character> set) {
        set.clear();
        for (int i = 0; i < SUB_BOX_SIZE; i++) {
            for (int j = 0; j < SUB_BOX_SIZE; j++)
                if (board[i + topRow][j + leftCol] != '.' && !set.add(board[i + topRow][j + leftCol])) {
                    return false;
                }
        }
        return true;
    }
}
