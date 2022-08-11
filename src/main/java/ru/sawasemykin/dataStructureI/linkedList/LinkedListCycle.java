package ru.sawasemykin.dataStructureI.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }

    /**
     * O(n) memory
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (!visited.add(head))
                return true;
            head = head.next;
        }
        return false;
    }

    /**
     * O(1) memory
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) return false;
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
