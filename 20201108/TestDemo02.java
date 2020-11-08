package test20201108;
//NC72 操作给定的二叉树，将其变换为源二叉树的镜像。  牛客   https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=188&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-week%2Fquestion-ranking
import java.util.*;
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
 class Solution {
    public void Mirror(TreeNode root) {
        //非递归
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len > 0) {
                TreeNode cur = queue.poll();
                TreeNode temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                len--;
            }
        }
//         //递归
//         if(root == null)return;
//         TreeNode tmp = root.left;
//         root.left = root.right;
//         root.right = tmp;
//         Mirror(root.left);
//         Mirror(root.right);
    }
}
public class TestDemo02 {
}
