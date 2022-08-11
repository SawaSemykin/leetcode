package ru.sawasemykin.dataStructureI.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * FIFO queue using only two stacks.
 * push, peek, pop, isEmpty are only available on Deque
 *
 * @author anduser
 */
public class MyQueue {
    private final Deque<Integer> first;
    private final Deque<Integer> second;

    public MyQueue() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }

    public void push(int x) {
        first.push(x);
        second.clear();
        for (int i : first)
            second.push(i);
    }

    public int pop() {
        int x = second.pop();
        first.clear();
        for (int i : second)
            first.push(i);
        return x;
    }

    public int peek() {
        return second.peek();
    }

    public boolean isEmpty() {
        assert first.isEmpty() == second.isEmpty();
        return first.isEmpty();
    }
}
