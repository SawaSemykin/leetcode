package ru.sawasemykin.dataStructureI.linkedList;

public class ReverseLinkedList {
    /**
     * recursive solution
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }

    private ListNode reverseList(ListNode head, ListNode reversed) {
        if (head == null) {
            return reversed;
        }
        reversed = new ListNode(head.val, reversed);
        return reverseList(head.next, reversed);
    }

    /**
     * iterative solution
     * @param head
     * @return
     */
//    public ListNode reverseList(ListNode head) {
//        ListNode reversed = null;
//        while (head != null) {
//            reversed = new ListNode(head.val, reversed);
//            head = head.next;
//        }
//        return reversed;
//    }
}
