package test20201116;
//105. 从前序与中序遍历序列构造二叉树  力扣

public class TestDemo03 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int preIndex = 0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,
                                   int inbegin, int inend) {
        if (inbegin > inend) return null;
        TreeNode root = new TreeNode(preorder[preIndex]);
        int inorderIndex = findInorderIndexroot(inorder,inbegin,inend,preorder[preIndex]);
        preIndex++;
        root.left = buildTreeChild(preorder,inorder,inbegin,inorderIndex-1);
        root.right = buildTreeChild(preorder,inorder, inorderIndex+1,inend);
        return root;
    }

    public int findInorderIndexroot(int[] inorder,int inbegin,int inend,int val) {
        for (int i = inbegin; i <= inend; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        if (preorder.length == 0 || inorder.length == 0) return null;
        return buildTreeChild(preorder,inorder,0,inorder.length-1);

    }

    public static void main(String[] args) {

    }
}
