package ru.sawasemykin.dataStructureI.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BinaryTreeInorderTraversalTest {
    private final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @ParameterizedTest
    @MethodSource("rootAndExpectedList")
    void test(TreeNode root, List<Integer> expectedResult) {
        List<Integer> actualResult = solution.inorderTraversal(root);
        Assertions.assertEquals(expectedResult.size(), actualResult.size());
        Assertions.assertIterableEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> rootAndExpectedList() {
        return Stream.of(
                arguments(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
                        Arrays.asList(1, 3, 2)),
                arguments(null, Collections.emptyList()),
                arguments(new TreeNode(1, new TreeNode(2), null),
                        Arrays.asList(2, 1)),
                arguments(new TreeNode(1, null, new TreeNode(2)),
                        Arrays.asList(1, 2))
        );
    }
}
