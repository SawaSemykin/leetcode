package ru.sawasemykin.dataStructureI.linkedList;

public class RemoveLinkedListElements {
    // todo too slow and memory expensive
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.val == val)
            return removeElements(head.next, val);
        if (head != null)
            head.next = removeElements(head.next, val);
        return head;
    }
}
