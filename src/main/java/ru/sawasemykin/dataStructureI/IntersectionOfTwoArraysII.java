package ru.sawasemykin.dataStructureI;

import java.util.HashSet;
import java.util.LinkedList;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            int[] tmp;
            tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        LinkedList<Integer> result = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        OUTER_LOOP: for (int i = 0; i < nums2.length; i++)
            for (int j = 0; j < nums1.length; j++) {
                if (visited.contains(j))
                    continue;
                if (nums1[j] == nums2[i]) {
                    result.add(nums1[j]);
                    visited.add(j);
                    continue OUTER_LOOP;
                }
            }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
