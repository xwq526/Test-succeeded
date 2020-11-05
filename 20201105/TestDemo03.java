package test20201105;
//94. 二叉树的中序遍历  力扣     https://leetcode-cn.com/problems/binary-tree-inorder-traversal/


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
//二叉树的中序遍历
/*class Solution {//已通过  可以把list拿出来，这样就不用一直传递了变成一个成员变量
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(list,root);
        return list;

    }
    public void inorder( List<Integer> list ,TreeNode root ) {
        if (root == null) return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
}*/
public class TestDemo03 {
}
