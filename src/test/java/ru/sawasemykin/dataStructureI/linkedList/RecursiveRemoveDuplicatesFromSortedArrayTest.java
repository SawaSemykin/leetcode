package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveRemoveDuplicatesFromSortedArrayTest {

    private final RecursiveSolution solution = new RecursiveSolution();

    @Test
    void whenEmptyBoth_thenResultEmpty() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void whenEmptyFirst_thenResultAsSecond() {
        ListNode l2 = new ListNode(1);
        ListNode result = solution.mergeTwoLists(null, l2);
        assertEquals("[1]", result.toString());
    }

    @Test
    void whenEmptySecond_thenResultAsFirst() {
        ListNode l1 = new ListNode(1);
        ListNode result = solution.mergeTwoLists(l1, null);
        assertEquals("[1]", result.toString());
    }

    @Test
    void regularTest() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = solution.mergeTwoLists(l1, l2);
        assertEquals("[1, 1, 2, 3, 4, 4]", result.toString());
    }
}
