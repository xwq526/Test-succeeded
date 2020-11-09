package test20201109;
//编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
// 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
// 建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
import java.util.*;
/*class Node{
    char val;
    Node left;
    Node right;
    public Node(char val) {
        this.val = val;
    }
}*/
 class Main1{

    public static int i = 0;
    public static Node createTreeByString(String str) {//构建二叉树
        Node root = null;
        if(str.charAt(i) != '#'){
            root = new Node(str.charAt(i));
            i++;
            root.left = createTreeByString(str);
            root.right = createTreeByString(str);
        } else {
            i++;
        }
        return root;
    }

    public static void midOrder (Node root) {//中序遍历
        if (root == null) return;
        midOrder(root.left);
        System.out.print(root.val+" ");
        midOrder(root.right);
    }
    public static void main (String[] args) {//调用
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Node root = createTreeByString(str);
        midOrder(root);
    }
}






public class TestDemo01 {
}
