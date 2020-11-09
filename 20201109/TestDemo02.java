package test20201109;
//236. 二叉树的最近公共祖先
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //一共五种情况，要考虑清楚
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        if (left != null) return left;
        if (right != null) return right;
        return null;




        //  if(root == null) {
        //     return null;
        // }
        // if(root == p || root == q) {
        //     return root;
        // }
        // TreeNode lefRoot = lowestCommonAncestor(root.left, p, q);
        // TreeNode rightRoot = lowestCommonAncestor(root.right, p, q);
        // if (lefRoot != null && rightRoot != null) {
        //     return root;
        // }
        // if (lefRoot != null) return lefRoot;
        // if (rightRoot != null) return rightRoot;
        // return null;
    }
}*/
public class TestDemo02
{
}
