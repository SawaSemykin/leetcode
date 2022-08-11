package ru.sawasemykin.dataStructureI.string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        Map<Character, Integer> charToItsLastIdx = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int from = charToItsLastIdx.getOrDefault(chars[i], 0);
            int found = magazine.indexOf(chars[i], from);
            if (found == -1)
                return false;
            charToItsLastIdx.put(chars[i], ++found);
        }
        return true;
    }
}
