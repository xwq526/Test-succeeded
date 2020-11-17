package test20201117;



public class BinarySearchTree {
    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    static Node root = null;

    public static void put(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if (cur.data < key) {
                parent = cur;
                cur = cur.right;
            } else if(cur.data > key) {
                parent = cur;
                cur = cur.left;
            } else {
                cur.data = key;
                return;
            }
        }
        //此时的cur为null， parent是cur的父亲节点
        if (parent.data < key) {
            parent.right = node;
        } else {
            parent.left = node;
        }
    }
    //查找
    public static Node findVal(int val) {
        if (root == null) return null;
        Node cur = root;
        while (cur != null) {
            if (cur.data == val) {
                return cur;
            }else if (cur.data < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }


    //中序遍历
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //前序遍历
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }



    //删除
    public static boolean remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.data == key) {
                removeNode(parent,cur);
                return true;
            }else if (cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    /**
     *
     * @param parent  要删除节点的父亲节点
     * @param cur     当前需要删除的节点
     */
    public static void removeNode(Node parent,Node cur){
        //下面的分类情况比较多，要细心，
        if (cur.left == null) {//cur的左为空
            if (cur == root) {
                root = cur.right;
            }else if (parent.left == cur) {
                parent.left = cur.right;
            }else {//parent.right == cur
                parent.right = cur.right;
            }
        } else if (cur.right == null) {//cur的右为空
            if (cur == root) {
                root = cur.left;
            } else if (parent.left == cur) {
                parent.left = cur.left;
            } else {//parent.right == cur
                parent.right = cur.left;
            }
        }else {//cur的左右都不为空
            //使用替换法，然后删除那个元素
            Node targetParent = cur;
            //这里的方法是向右边找最小然后替换
            Node target = targetParent.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //找到了，此时target就是需要的元素
            cur.data = target.data;
            //替换了之后就需要把他删了
            //这时候就知道target的左边肯定是没有元素的，就只需要判断target是在targetParent的左边还是右边，把targetParent和target.right连接起来就可以了。
            if (target == targetParent.left) {
                targetParent.left = target.right;
            } else {
                targetParent.right = target.right;
            }

        }

    }



    public static void main(String[] args) {
        int[] array = {15,23,19,67,4,19,10};
        for (int i = 0; i < array.length; i++) {
            put(array[i]);
        }
        preorder(root);
        System.out.println("================");
        inorder(root);
        System.out.println("============");
        remove(15);
        preorder(root);
        System.out.println("================");
        inorder(root);
        System.out.println("============");
//        try {
//            System.out.println(findVal(19).data);
//        }catch (NullPointerException e) {
//            e.printStackTrace();
//            System.out.println("没有这个节点");
//        }

    }
}

