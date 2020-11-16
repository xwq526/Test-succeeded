package test20201116;
//剑指 Offer 26. 树的子结构 力扣
//输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
//        B是A的子结构， 即 A中有出现和B相同的结构和节点值。
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
class Solution1 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {//这样做是有问题的
        if (A == null || B == null) return false;
        if (isSame(A,B)) return true;
        if (isSubStructure(A.left,B)) return true;
        if (isSubStructure(A.right,B)) return true;
        return false;
    }
    public boolean isSame(TreeNode A , TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null) return false;
        if (A.val != B.val) return false;
        return isSame(A.left,B.left) && isSame(A.right,B.right);
    }
}
public class TestDemo02 {
}
