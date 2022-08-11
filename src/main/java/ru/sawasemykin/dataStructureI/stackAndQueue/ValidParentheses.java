package ru.sawasemykin.dataStructureI.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Character prev;
        for(char curr : s.toCharArray()) {
            prev = stack.peek();
            switch (curr) {
                case '}':
                    if (prev != null && prev != '{') return false;
                    else if (prev != null && prev == '{') stack.poll();
                    else stack.push(curr);
                    break;
                case ')':
                    if (prev != null && prev != '(') return false;
                    else if (prev != null && prev == '(') stack.poll();
                    else stack.push(curr);
                    break;
                case ']':
                    if (prev != null && prev != '[') return false;
                    else if (prev != null && prev == '[') stack.poll();
                    else stack.push(curr);
                    break;
                default:
                    stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
}
