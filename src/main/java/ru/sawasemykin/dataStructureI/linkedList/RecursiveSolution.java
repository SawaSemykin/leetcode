package ru.sawasemykin.dataStructureI.linkedList;

public class RecursiveSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergeTwoLists(l1, l2, null);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2, ListNode result) {
        if (l1 == null && l2 != null)
            return l2;
        if (l2 == null && l1 != null)
            return l1;
        if (l1 == null && l2 == null)
            return result;

        if (l1.val > l2.val) {
            result = l2;
            result.next = mergeTwoLists(l1, l2.next, result.next);
        } else {
            result = l1;
            result.next = mergeTwoLists(l1.next, l2, result.next);
        }
        return result;
    }
}
