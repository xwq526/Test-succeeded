package test20201109;
//606. 根据二叉树创建字符串
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
    public void tree2strChlid(TreeNode t , StringBuilder sb) {
        if (t == null) return ;
        sb.append(t.val);
        if (t.left == null) {//左边为空
            if (t.right == null) {//左边为空，右边为空
                return;
            } else {//左边为空，右边不为空
                sb.append("()");
            }
        } else {//左边不为空
            sb.append("(");
            tree2strChlid(t.left,sb);
            sb.append(")");
        }
        if (t.right == null) {//右边为空
            return;
        } else {//右边不为空
            sb.append("(");
            tree2strChlid(t.right,sb);
            sb.append(")");
        }
    }
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        StringBuilder sb = new StringBuilder();
        tree2strChlid(t, sb);
        return sb.toString();
    }
}*/
public class TestDemo04 {
}
