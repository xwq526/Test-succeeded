package test20201023;
class  ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }
}
public class DoubleList {
    public ListNode head;//双向链表的头
    public ListNode last;//双向链表的尾巴
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.last = node;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }
        this.last.next =node;
        node.prev = this.last;
        this.last = node;

    }
    public  ListNode searchIndex(int index) {
        if (index < 0 || index > size()) {
            System.out.println("不合法");
            return null;
        }
        ListNode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }


    //任意位置插入,第一个数据节点为0号下标
    public  void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        //首先要判断index的合法性；
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        //和单链表不同，这个不用找前驱，直接找index。
        ListNode cur = searchIndex(index);
        if (cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //如果删除的是第一个
                if (this.head.val == key) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {//如果不是第一个
                    cur.prev.next = cur.next;
                    if (cur.next == null) {//如果是最后一个
                        this.last = this.last.prev;
                    }else {
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //如果删除的是第一个
                if (this.head.val == key) {
                    //如果只有一个节点，或者所有都是key，要加判断，否者可能出现空指针异常
                    if (this.head.next == null) {
                        this.head = null;
                        return;
                    }
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {//如果不是第一个
                    cur.prev.next = cur.next;
                    if (cur.next == null) {//如果是最后一个
                        this.last = this.last.prev;
                    }else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //得到双链表的长度
    public int size(){
       ListNode cur = this.head;
       int count = 0;
       while (cur != null) {
           count++;
           cur = cur.next;
       }
       return count;
    }
    public void display(){
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        this.head = null;
        this.last = null;
    }

}
