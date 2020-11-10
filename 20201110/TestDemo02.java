package test20201110;

import java.util.*;

class Solution1{//二叉树非递归中序遍历   已经通过oj
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) return ret;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            ret.add(top.val);
            cur = top.right;
        }
        return ret;
    }
}
public class TestDemo02 {
}
