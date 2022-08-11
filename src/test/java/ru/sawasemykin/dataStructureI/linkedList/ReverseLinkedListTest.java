package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class ReverseLinkedListTest {
    private final ReverseLinkedList solution = new ReverseLinkedList();

    @ParameterizedTest
    @MethodSource("headAndExpectedResult")
    void reverseList(ListNode head, ListNode expectedResult) {
        Assertions.assertEquals(Optional.ofNullable(expectedResult).map(ListNode::toString).orElse("[]"),
                Optional.ofNullable(solution.reverseList(head)).map(ListNode::toString).orElse("[]"));
    }

    static Stream<Arguments> headAndExpectedResult() {
        return Stream.of(
                Arguments.arguments(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))),

                Arguments.arguments(
                        new ListNode(1, new ListNode(2)),
                        new ListNode(2, new ListNode(1))),

                Arguments.arguments(
                        null,
                        null)
        );
    }
}
