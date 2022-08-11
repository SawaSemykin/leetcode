package ru.sawasemykin;

public class RemoveDuplicatesFromSortedArray {
    /**
     *
     *
     * @param nums input array
     * @return k after placing the final result in the first k slots of nums
     */
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = duplicateCountOf(nums, i);
            if (count > 0) {
                shiftLeft(nums, i + count, count);
                markTail(nums, count);
                k -= count;
            }
        }

        return k;
    }

    private int duplicateCountOf(int[] nums, int i) {
        int count = 0;
        int j;
        for (j = i + 1; j < nums.length && nums[i] == nums[j]; j++)
            if (nums[j] != Integer.MAX_VALUE)
                count++;

        return count;
    }

    private void shiftLeft(int[] nums, int from, int count) {
        for (int i = from; i < nums.length; i++)
            nums[i - count] = nums[i];
    }

    private void markTail(int[] nums, int count) {
        for (int i = nums.length -1; nums.length - i <= count; i--)
            nums[i] = Integer.MAX_VALUE;
    }
}
