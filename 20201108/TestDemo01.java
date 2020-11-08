package test20201108;
// NC45 分别按照二叉树先序，中序和后序打印所有的节点。 牛客   https://www.nowcoder.com/practice/a9fec6c46a684ad5a3abd4e365a9d362?tpId=188&&tqId=36318&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }

class Solution1 {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if (root == null) return null;

        List<Integer> pre = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
        preOrders(root, pre);
        midOrders(root, mid);
        suffixOrders(root,suffix);
        int[][] ret = new int[3][pre.size()];//注意这个二维数组的第二维
        for(int i = 0 ; i < pre.size(); i++){//把list里面的元素放进数组里面
            ret[0][i] = pre.get(i);
            ret[1][i] = mid.get(i);
            ret[2][i] = suffix.get(i);
        }
        return ret;
    }
    public void preOrders (TreeNode node , List<Integer> list) {//前序遍历
        if (node == null) return;
        list.add(node.val);
        preOrders(node.left, list);
        preOrders(node.right,list);
    }
    public void midOrders (TreeNode node , List<Integer> list) {//中序遍历
        if (node == null) return;
        midOrders(node.left, list);
        list.add(node.val);
        midOrders(node.right,list);
    }
    public void suffixOrders (TreeNode node , List<Integer> list) {//后续遍历
        if (node == null) return;
        suffixOrders(node.left, list);
        suffixOrders(node.right,list);
        list.add(node.val);
    }
}

public class TestDemo01 {
}
