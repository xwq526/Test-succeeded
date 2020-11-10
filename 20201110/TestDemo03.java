package test20201110;

import java.util.*;

class Solution2 {//二叉树非递归后序遍历   已经通过oj
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) return ret;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                stack.pop();
                ret.add(cur.val);
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        return ret;
    }
}
public class TestDemo03 {
}
