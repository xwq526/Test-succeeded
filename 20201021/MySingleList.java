package test20201021;
class Node {
    public int data;
    public Node next;//存储对象引用

    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向哪个节点
    }
}

public class MySingleList {
    public Node head;//作用是，定位头节点的引用
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;//这两行其实也包括了当链表为空的情况
        this.head = node;
//        if (this.head == null){
//            this.head = node;
//        }else{
//            node.next = this.head;
//            this.head = node;
//        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //求index-1位置的节点
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
         Node node = new Node(data);
         //首先得判断index的合法性
        if (index < 0 || index > this.size()){
            System.out.println("位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public Node searchPrevNode(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;//代表没有key的前驱
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
       //1.考虑头节点
//        if (this.head.data == key) {
//            this.head = this.head.next;
//            return;
//        }
//        // 2.找需要删除节点的前驱
//        Node prev = searchPrevNode(key);
//        if (prev == null){
//            return;
//        }
//        Node del = prev.next;//就是要删除节点的引用
//        prev.next = del.next;
        if (!contains(key)){
            System.out.println("没有这个关键字");
            return;
        }
        //如果是第一个
        if (head.data == key){
            this.head = head.next;
            return;
        }
        Node cur = this.head;
        while (cur != null){
            if (cur.next.data == key){
                Node tmp = cur.next;
                cur.next = cur.next.next;
                tmp.next = null;
                break;
            }
            cur = cur.next;
        }
   }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
//        while (contains(key)) {
//            remove(key);
//        }
        //双指针解题思路（这是一种思想方式）
        //cur:代表当前需要删除的节点
        //prev：代表当前要删除节点的前驱
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }


//        Node prev = this.head;
//        Node cur = this.head.next;
//        while (cur != null){
//            if (cur.data == key){
//                prev.next = cur.next;
//            }else {
//                prev = cur;
//            }
//            cur = cur.next;
//        }
//        if (this.head.data == key) {
//            this.head = this.head.next;
//        }
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //遍历链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
        this.head = null;
    }

    /**
     * 自定义打印   从指定的节点开始打印
     * @param newHead
     */
    public void display2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    //反转链表
    public Node reverserList(){
        Node newHead = null;
        Node cur = this.head;
        Node prev = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    //中间元素，   （快慢指针法）
    public Node middleNode(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //倒数第k个节点   思路：双指针
    public Node findKthToTai(int k) {
        if (k <= 0){//oj题要注意再判断一下head是不是为null；
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while ( k-1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            }else {
//                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}

