package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class RemoveLinkedListElementsTest {
    private final RemoveLinkedListElements solution = new RemoveLinkedListElements();

    @ParameterizedTest
    @MethodSource("headAndValAndExpectedResult")
    void removeElements(ListNode head, int val, ListNode expectedResult) {
        Assertions.assertEquals(Optional.ofNullable(expectedResult).map(ListNode::toString).orElse(null),
                Optional.ofNullable(solution.removeElements(head, val)).map(ListNode::toString).orElse(null));

    }

    static Stream<Arguments> headAndValAndExpectedResult() {
        return Stream.of(
                Arguments.arguments(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                        new ListNode(4, new ListNode(5, new ListNode(6))))))),
                        6,
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))),

                Arguments.arguments(null, 1, null),

                Arguments.arguments(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))),
                        7,
                        null),

                Arguments.arguments(new ListNode(7, new ListNode(7)),
                        7,
                        null),

                Arguments.arguments(new ListNode(7),
                        7,
                        null)
        );
    }
}
