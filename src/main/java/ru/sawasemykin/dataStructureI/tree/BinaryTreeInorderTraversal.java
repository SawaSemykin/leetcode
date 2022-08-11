package ru.sawasemykin.dataStructureI.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aleksandr Semykin
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
