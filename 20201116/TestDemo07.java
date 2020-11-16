package test20201116;
//106. 从中序与后序遍历序列构造二叉树 力扣
public class TestDemo07 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTreeChild(int[] inorder, int[] postorder,
                              int inbegin, int inend) {
        if (inbegin > inend) return null;
        TreeNode root = new TreeNode(postorder[p]);
        int inorderIndex = findInorderIndexOfRoot(inorder,inbegin,inend,postorder[p]);
        p--;
        //这个必须先递归右子树
        root.right = buildTreeChild(inorder,postorder,inorderIndex+1,inend);
        root.left = buildTreeChild(inorder,postorder,inbegin,inorderIndex-1);
        return root;
    }
    public int findInorderIndexOfRoot(int[] inorder,int inbegin, int inend,int val) {
        for (int i = inbegin; i <= inend; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
    int p = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) return null;
        if (inorder.length == 0 || postorder.length == 0) return null;
        p = postorder.length-1;
        return buildTreeChild(inorder,postorder,0,postorder.length-1);
    }

















    public static void main(String[] args) {

    }
}
