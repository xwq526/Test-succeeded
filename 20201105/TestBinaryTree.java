package test20201105;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println(binaryTree.getSize2(root));
        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);


    }
}
