package ru.sawasemykin.dataStructureI.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveDuplicatesFromSortedListTest {
    private final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    @ParameterizedTest
    @MethodSource("headAndExpectedStr")
     void deleteDuplicates(ListNode head, String expected) {
        String actual = solution.deleteDuplicates(head).toString();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> headAndExpectedStr() {
        return Stream.of(
                arguments(new ListNode(1, new ListNode(1, new ListNode(2))), "[1, 2]"),
                arguments(new ListNode(1, new ListNode(1, new ListNode(2,
                        new ListNode(3, new ListNode(3))))), "[1, 2, 3]")
        );
    }
}
