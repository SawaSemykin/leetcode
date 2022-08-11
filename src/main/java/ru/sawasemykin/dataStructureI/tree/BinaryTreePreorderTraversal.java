package ru.sawasemykin.dataStructureI.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aleksandr Semykin
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversalRecursively(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorderTraversalRecursively(root, result);
        return result;
    }

    public List<Integer> preorderTraversalIteratively(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorderTraversalRecursively(root, result);
        return result;
    }

    private void preorderTraversalRecursively(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        preorderTraversalRecursively(node.left, list);
        preorderTraversalRecursively(node.right, list);
    }
}
