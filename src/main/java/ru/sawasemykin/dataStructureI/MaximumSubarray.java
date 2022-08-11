package ru.sawasemykin.dataStructureI;

public class MaximumSubarray {
    // todo на leetcode есть тесты, которые не проходят
    public int maxSubArray(int[] nums) {
        int pivot = nums[0];
        int maxSum, currSum;
        maxSum = currSum = pivot;
        for (int i = 1; i < nums.length; i++) {
            if (currSum < nums[i]) {
                pivot = nums[i];
                currSum = Integer.max(currSum + pivot, pivot);
            } else {
                currSum += nums[i];
            }
            maxSum = Integer.max(maxSum, currSum);
        }
        return Integer.max(currSum, maxSum);
    }
}
