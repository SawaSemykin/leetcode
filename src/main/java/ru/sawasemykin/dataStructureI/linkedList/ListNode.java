package ru.sawasemykin.dataStructureI.linkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(val);
        ListNode p = next;
        while (p != null) {
            builder.append(", ").append(p.val);
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
