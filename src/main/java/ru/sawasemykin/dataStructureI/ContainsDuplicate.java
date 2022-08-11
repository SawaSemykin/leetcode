package ru.sawasemykin.dataStructureI;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // bruteforce solution
//        for (int i = 0; i < nums.length; i++)
//            for (int j = i + 1; j < nums.length; j++)
//                if (nums[i] == nums[j])
//                    return true;
//
//        return false;
        Set<Integer> distinctNums = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            distinctNums.add(nums[i]);
            if (distinctNums.size() != i + 1)
                return true;
        }
        return distinctNums.size() != nums.length;
    }
}
