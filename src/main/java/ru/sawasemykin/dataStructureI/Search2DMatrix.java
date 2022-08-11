package ru.sawasemykin.dataStructureI;

import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        NavigableMap<Integer, Integer> valueToIdx = new TreeMap<>();
        for (int i = 0; i < matrix.length; i++)
            valueToIdx.put(matrix[i][0], i);
        Optional<Integer> floorOpt = Optional.ofNullable(valueToIdx.floorKey(target));
        if (floorOpt.isPresent()) {
            int floor = floorOpt.get();
            int floorIdx = valueToIdx.get(floor);
            for (int i = 0; i < matrix[floorIdx].length; i++)
                if (matrix[floorIdx][i] == target)
                    return true;
        }
        return false;
    }
}
