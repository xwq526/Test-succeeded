package test20201025;

class  ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }
}
public class DoubleLinkedList {
    public ListNode dummyHead;//头
    public ListNode last;//尾巴

    public DoubleLinkedList () {
        this.dummyHead = new ListNode(-1);
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.dummyHead.next == null) {
            this.dummyHead.next = node;
            node.prev = this.dummyHead;
            this.last = node;
            return;
        }
        node.next = dummyHead.next;
        node.prev = this.dummyHead;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.dummyHead.next == null) {
            this.dummyHead.next = node;
            node.prev = this.dummyHead;
            last = node;
            return;
        }
        last.next = node;
        node.prev = last;
        last = node;
    }
    //
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > size()) {
            System.out.println("下标不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }

        ListNode cur = dummyHead.next;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        if (cur == null) {
            return;
        }
        cur.prev.next = node;
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在链表当中
    public boolean contains(int key) {
        ListNode cur = this.dummyHead.next;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.dummyHead.next;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == last) {
                    cur.prev.next = cur.next;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.dummyHead.next;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == last) {
                    cur.prev.next = cur.next;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    //得到带傀儡节点双链表的长度
    public int size() {
        ListNode cur = this.dummyHead.next;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }


    //遍历
    public void display() {
        ListNode cur = dummyHead;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
        this.dummyHead.next = null;
        this.last = null;
    }
}

