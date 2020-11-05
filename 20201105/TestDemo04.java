package test20201105;
//145. 二叉树的后序遍历  力扣    https://leetcode-cn.com/problems/binary-tree-postorder-traversal/

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*class Solution {//已通过
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorder(list,root);
        return list;
    }
    public void postorder(List<Integer> list , TreeNode root) {
        if (root == null) return;
        postorder(list , root.left);
        postorder(list , root.right);
        list.add(root.val);
    }
}*/
public class TestDemo04 {
}
