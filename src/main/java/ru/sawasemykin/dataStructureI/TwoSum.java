package ru.sawasemykin.dataStructureI;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer idx = valueToIdx.put(nums[i], i);
            if (idx != null && 2 * nums[i] == target)
                return new int[] {idx, i};
        }
        for (Integer value : valueToIdx.keySet()) {
            int x = target - value;
            Integer idx = valueToIdx.get(x);
            if (idx != null)
                return new int[] {valueToIdx.get(value), valueToIdx.get(x)};
        }

        throw new IllegalArgumentException("Input parameters are not valid!");
    }
}
