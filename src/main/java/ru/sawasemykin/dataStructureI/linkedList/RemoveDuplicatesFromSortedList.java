package ru.sawasemykin.dataStructureI.linkedList;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start, end;
        start = end = head;
        while (start != null) {
            while (end != null && start.val == end.val)
                end = end.next;
            start.next = end;
            start = end;
        }
        return head;
    }
}
