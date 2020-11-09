package test20201109;
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。


//解题思路：前驱为left 后继为right。二叉树和双向链表都是三个域。

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
/*public class Solution {
    public  TreeNode prev;
    public  void ConvertChild(TreeNode root) {//变成链表
        if (root == null) return;
        ConvertChild(root.left);
        root.left = prev;
        if(prev != null) {
            prev.right = root;
        }
        prev = root;
        ConvertChild(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        while (head.left != null) {//找到头节点
            head = head.left;
        }
        return head;
    }
}*/
public class TestDemo03 {
}
