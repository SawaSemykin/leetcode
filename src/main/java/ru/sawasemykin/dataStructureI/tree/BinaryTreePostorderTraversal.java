package ru.sawasemykin.dataStructureI.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aleksandr Semykin
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.val);
    }
}
