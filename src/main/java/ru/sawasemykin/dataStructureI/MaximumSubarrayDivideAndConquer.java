package ru.sawasemykin.dataStructureI;


/**
 * Suppose we want to find a maximum sub-array of the sub-array A[low::high].
 * Divide-and-conquer suggests that we divide the sub-array into two sub-arrays of as equal size as possible.
 * That is, we find the midpoint, say mid, of the sub-array, and consider the sub-arrays A[low::mid] and A[mid+1::high].
 * Any contiguous sub-array A[i::j] of A[low::high] must lie in exactly one of the following places:
 * 1) Entirely in the sub-array A[low::mid]
 * 2) Entirely in the sub-array A[mid+1::high]
 * 3) Crossing the midpoint (mid)
 * Therefore, a maximum sub-array of A[low::high] must lie in exactly one of these places.
 * In fact, a maximum sub-array of A[low::high] must have the greatest sum over all sub-arrays entirely in A[low::mid], entirely in A[mid+1::high], or crossing the midpoint.
 * We can find maximum sub-arrays of A[low::mid] and A[mid+1::high] recursively, because these two sub-problems are smaller instances of the problem of finding a maximum sub-array.
 * Thus, all that is left to do is find a maximum sub-array that crosses the midpoint, and take the sub-array with the largest sum of the three.
 * Any sub-array crossing the midpoint is itself made of two sub-arrays - A[i::mid] and A[mid+1::j], where low <= i <= mid and mid < j <= high.
 * Therefore, we just need to find maximum sub-arrays of the form A[i::mid] and A[mid+1::j] and then combine them.
 */
public class MaximumSubarrayDivideAndConquer {

    public int maxSubArray(int[] nums) {
        return maxSum(nums, 0, nums.length - 1);
    }

    private int maxSum(int[] nums, int low, int high) {
        if (low == high)
            return nums[low];

        int mid = (high + low) / 2;

        int leftSum = maxSum(nums, low, mid);
        int rightSum = maxSum(nums, mid + 1, high);
        int crossSum = crossSum(nums, low, mid, high);

        return Integer.max(Integer.max(leftSum, rightSum), crossSum);
    }

    private int crossSum(int[] nums, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += nums[i];
            leftSum = Integer.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += nums[i];
            rightSum = Integer.max(rightSum, sum);
        }
        return leftSum + rightSum;
    }
}
