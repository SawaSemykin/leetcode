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

class BinaryTreeLevelOrderTraversalTest {
    private final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @ParameterizedTest
    @MethodSource("rootAndExpectedList")
    void test(TreeNode root, List<List<Integer>> expectedResult) {
        List<List<Integer>> actualResult = solution.levelOrder(root);
        Assertions.assertEquals(expectedResult.size(), actualResult.size());
        Assertions.assertIterableEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> rootAndExpectedList() {
        return Stream.of(
                arguments(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))),
                        Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7))),
                arguments(new TreeNode(1),
                        Arrays.asList(Arrays.asList(1))),
                arguments(null,
                        Collections.emptyList())
        );
    }
}
