package test20201105;
//144. 二叉树的前序遍历   力扣  https://leetcode-cn.com/problems/binary-tree-preorder-traversal/

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
//二叉树的前序遍历
/*class Solution {//已通过
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preorder(list,root);
        return list;
    }
    public void preorder( List <Integer>list , TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
}*/


//这个方法也可以   notice哦哦哦哦哦   适用与前，中 ，后序
/*public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null) return list;
        list.add(root.val);
        List<Integer> treeLeft = preorderTraversal(root.left);
        list.addAll(treeLeft);
        List<Integer> treeRight = preorderTraversal(root.right);
        list.addAll(treeRight);
        return list;
        }*/

public class TestDemo02 {

}
