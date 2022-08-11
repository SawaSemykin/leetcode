package ru.sawasemykin.dataStructureI.string;

import java.util.*;

public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charToIdx = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            charToIdx.merge(chars[i], i, (idx1, idx2) -> Integer.MAX_VALUE);
        }
        Collection<Integer> idxs = charToIdx.values();
        Integer min = Collections.min(idxs);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
