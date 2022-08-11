package ru.sawasemykin;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, idx = 0; i < n; i++, idx++, m++) {
            while(idx < m && nums2[i] >= nums1[idx]) idx++;
            if (idx < m) {
                for (int j = m; j > idx; j--)
                    nums1[j] = nums1[j - 1];
                nums1[idx] = nums2[i];
            } else {
                nums1[idx] = nums2[i];
            }
        }
    }
}
