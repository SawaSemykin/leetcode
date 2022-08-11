package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @ParameterizedTest
    @MethodSource("l1AndL2AndExpectedResult")
    void mergeTwoLists(ListNode l1, ListNode l2, ListNode expectedResult) {
        Assertions.assertEquals(Optional.ofNullable(expectedResult).map(ListNode::toString).orElse(null),
                Optional.ofNullable(solution.mergeTwoLists(l1, l2)).map(ListNode::toString).orElse(null));

    }

    static Stream<Arguments> l1AndL2AndExpectedResult() {
        return Stream.of(
                arguments(new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4))),
                        new ListNode(1, new ListNode(1, new ListNode(2,
                                new ListNode(3, new ListNode(4, new ListNode(4))))))),
                arguments(null, null, null),
                arguments(null, new ListNode(0), new ListNode(0)),
                arguments(new ListNode(0), null, new ListNode(0))
        );
    }
}
