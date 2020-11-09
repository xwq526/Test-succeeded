package test20201109;



import java.util.*;

class Node {
    public char val;
    Node right;
    Node left;

    public Node(char val) {
        this.val = val;
    }
}


public class BinaryTree {
    public Node createTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    // 前序遍历
    void preOrderTraversal(Node root){
        if (root == null) return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root){
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(Node root){
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(Node root){
        if (root == null) return;
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数
    int getSize2(Node root){

        if (root == null) {
            return 0;
        }
        return 1 + getSize2(root.left) + getSize2(root.right);
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数    //要重点理解 notice
    int getKLevelSize(Node root , int k){
        if (root == null) return 0;
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) +getKLevelSize(root.right,k-1);
    }


    // 获取二叉树的高度
    int getHeight(Node root) {
        /*//这里是坑
        if (root == null) {
            return 0;
        }
        return(getHeight(root.left )> getHeight(root.right)) ? getHeight(root.left) + 1 : getHeight(root.right) + 1;*/
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    // 查找 val 所在结点，没有找到返回 null

    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val) {//如果值是引用类型，要用equals方法判断是不是相等，
        if (root == null) return null;
        if (root.val == val) return root;
        Node leftFind = find(root.left,val);
        return leftFind == null ? find(root.right,val) : leftFind;
    }
    //判断两棵树是不是相同的树
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {//都为空
            return true;
        } else if (p == null || q == null) {//一个为空
            return false;
            //前序遍历    子问题思路
        } else if (p.val != q.val) {//根节点
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
    //    572. 另一个树的子树
//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
//s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
    public boolean isSubtree(Node s, Node t) {
        if (s == null) return false;
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
//    判断一颗二叉树是否是平衡二叉树  110. 平衡二叉树   力扣  已经通过

//    101. 对称二叉树  力扣  已经通过

    //层序遍历          利用队列来实现
    void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }

    }
//    102. 二叉树的层序遍历  力扣   已通过
//    判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {
        if (root == null) return true;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur == null) break;
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        int count =  queue.size();
        for (int i = 0; i < count; i++) {//这里注意不能用i < queue.size(); 因为他一直在变。
            if (queue.poll() != null) return false;
        }
        return true;
    }
//    给定一个二叉树, 找到该树中两个指定节点的最近公共祖先 。
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        Node lefRoot = lowestCommonAncestor(root.left, p, q);
        Node rightRoot = lowestCommonAncestor(root.right, p, q);
        if (lefRoot != null && rightRoot != null) {
            return root;
        }
        if (lefRoot != null) return lefRoot;
        if (rightRoot != null) return rightRoot;
        return null;

    }

    //作业：
//    662. 二叉树最大宽度   力扣
    public int widthOfBinaryTree(Node root) {
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        q.offer(root);
        list.add(1);
        int res = 1;
        while (!q.isEmpty()) {
            int count = q.size();
            for(int i =count; i> 0; i--) {
                Node cur = q.poll();
                Integer curIndex = list.removeFirst();
                if(cur.left != null) {
                    q.offer(cur.left);
                    list.add(curIndex * 2);
                }
                if(cur.right != null) {
                    q.offer(cur.right);
                    list.add(curIndex * 2 +1);
                }
            }
            // list 中 size 为 1 的情况下，宽度也为 1，没有必要计算。
            if(list.size() >= 2) {
                res = Math.max(res, list.getLast() - list.getFirst() + 1);
            }
        }
        return res;
    }



}

