package ru.sawasemykin.dataStructureI.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // todo не экономно
        if (s.length() != t.length())
            return false;

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int from = map.getOrDefault(chars[i], 0);
            int found = t.indexOf(chars[i], from);
            if (found == -1)
                return false;
            map.put(chars[i], ++found);
        }
        return true;
    }
}
