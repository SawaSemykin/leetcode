package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.params.provider.Arguments.arguments;

class LinkedListCycleTest {
    private final LinkedListCycle solution = new LinkedListCycle();

    @ParameterizedTest
    @MethodSource("headAndExpectedOutput")
    void hasCycle(LinkedListCycle.ListNode head, boolean expectedOutput) {
        Assertions.assertEquals(expectedOutput, solution.hasCycle(head));
    }

    static Stream<Arguments> headAndExpectedOutput() {
        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(3);
        LinkedListCycle.ListNode pos1 = new LinkedListCycle.ListNode(2);
        LinkedListCycle.ListNode pos2 = new LinkedListCycle.ListNode(0);
        LinkedListCycle.ListNode pos3 = new LinkedListCycle.ListNode(-4);
        head.next = pos1;
        pos1.next = pos2;
        pos2.next = pos3;
        pos3.next = pos1;

        LinkedListCycle.ListNode head1 = new LinkedListCycle.ListNode(1);
        pos1 = new LinkedListCycle.ListNode(2);
        head1.next = pos1;
        pos1.next = head1;

        LinkedListCycle.ListNode head2 = new LinkedListCycle.ListNode(1);

        LinkedListCycle.ListNode head3 = new LinkedListCycle.ListNode(1);
        pos1 = new LinkedListCycle.ListNode(2);
        pos2 = new LinkedListCycle.ListNode(3);
        pos3 = new LinkedListCycle.ListNode(4);
        head3.next = pos1;
        pos1.next = pos2;
        pos2.next = pos3;
        pos3.next = head3;
        return Stream.of(
                arguments(head, true),
                arguments(head1, true),
                arguments(head2, false),
                arguments(head3, true)
        );
    }
}
