package test20201202;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-02
 * Time: 12:10:10
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
//    给定一个二叉树，返回该二叉树层序遍历的结果
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            while (size != 0){
                TreeNode cur = queue.poll();
                list1.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
                size--;
            }
            list.add(list1);
        }
        return list;
    }
//    给定一棵二叉树以及这棵树上的两个节点 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
    public  int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if (root == null) return -1;
        if (root.val == o1 || root.val == o2){
            return root.val;
        }
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (left != -1 && right != -1){
            return root.val;
        }
        if (left != -1){
            return left;
        }
        if (right != -1){
            return right;
        }
        return -1;
    }
//    给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
    //方法一：用队列来就进行层序遍历，然后间隔运用Collentions工具类的reverse来反转一下。
//        这个方法如果不用工具类，我们也可以定义一个数记录树的奇偶层，然后使用头插法或者尾插法来加入元素。
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        queue.offer(root);
        int count  = 0;
        while (!queue.isEmpty()){
            ArrayList<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            while (size != 0){
                TreeNode cur = queue.poll();
                list1.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
                size--;
            }
            if (count % 2 == 1){
                Collections.reverse(list1);//运用这个工具类使得list1反转
            }
            list.add(list1);
            count++;
        }
        return list;
    }
//    方法二  运用两个栈
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder1 (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> list1 = new ArrayList<>();
            while (!stack1.isEmpty()){
                TreeNode cur = stack1.pop();
                list1.add(cur.val);
                if (cur.left != null){
                    stack2.add(cur.left);
                }
                if (cur.right != null){
                    stack2.add(cur.right);
                }
            }
            if (list1.size() > 0){
                list.add(list1);
            }
            ArrayList<Integer> list2 = new ArrayList<>();
            while (!stack2.isEmpty()){
                TreeNode cur = stack2.pop();
                list2.add(cur.val);
                if (cur.right != null){
                    stack1.add(cur.right);
                }
                if (cur.left != null){
                    stack1.add(cur.left);
                }
            }
            if (list2.size() > 0){
                list.add(list2);
            }
        }
        return list;
    }

}
