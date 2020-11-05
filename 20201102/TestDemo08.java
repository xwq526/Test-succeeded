/*
package test20201102;
//实现 LinkedList 类  双链表实现
class ListNode<T> {
    public T val;
    public ListNode<T> next;
    public ListNode<T> prev;

    public ListNode(T val) {
        this.val = val;
    }
}
class MyLinkedList<T>{
    public ListNode<T> head;
    public ListNode<T> last;

    //头插法
    public void addFirst(T data) {
        ListNode<T> node = new ListNode<>(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    //尾插法
    public  void addLast(T data) {
        ListNode<T> node = new ListNode<>(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }
        this.last.next = node;
        node.prev = this.last;
        last = node;
    }
    //找到index下标的节点
    public ListNode<T> searchIndex (int index) {
        if (index < 0 || index > size()) {
            return null;
        }
        ListNode<T> cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex( int index,T data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode<T> node = new ListNode<>(data);
        ListNode<T> cur = searchIndex(index);
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //查找关键字key是否包含在链表中
    public boolean contains(T key) {
        ListNode<T> cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove (T key) {
        ListNode<T> cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                if (this.head.val == key) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = this.last.prev;
                    }
                }
                return;
            } else {
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllkey (T key) {
        ListNode<T> cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                if (this.head.val == key) {
                    if (this.head.next == null) {
                        this.head = null;
                        return;
                    }
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //得到双链表的长度
    public int size(){
        int count = 0;
        ListNode<T> cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //遍历链表
    public void display(){
        ListNode<T> cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class TestDemo08 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
//        list.addIndex(4,89);
        list.display();
        list.removeAllkey(1);
        list.display();
    }

}
*/
