package ru.sawasemykin;

import java.util.Arrays;

public class RemoveElement {
    private static final int MARKED = Integer.MAX_VALUE;
    public int removeElement(int[] nums, int val) {
        int markedCount = markElement(nums, val);
        Arrays.sort(nums);
        return nums.length - markedCount;
    }

    private int markElement(int[] nums, int val) {
        int markedCount = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == val) {
                nums[i] = MARKED;
                markedCount++;
            }
        return markedCount;
    }
}
