package ru.sawasemykin.dataStructureI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(Arrays.asList(1));
        int rowIdx = 1;
        while (rowIdx < numRows) {
            int length = rowIdx + 1;
            List<Integer> row = new ArrayList<>(length);
            List<Integer> prevRow = result.get(rowIdx - 1);
            for (int i = 0; i < length; i++) {
                if (i == 0 || i == length - 1)
                    row.add(1);
                else {
                    row.add(prevRow.get(i - 1) + prevRow.get(i));
                }
            }
            result.add(row);
            rowIdx++;
        }
        return result;
    }
}
