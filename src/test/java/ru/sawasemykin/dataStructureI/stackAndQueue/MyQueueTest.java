package ru.sawasemykin.dataStructureI.stackAndQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest {
    private final MyQueue myQueue = new MyQueue();

    @Test
    void test() {
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(false, myQueue.isEmpty());
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertEquals(false, myQueue.isEmpty());
        myQueue.push(1);
        Assertions.assertEquals(2, myQueue.peek());
        Assertions.assertEquals(2, myQueue.pop());
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
    }
}
