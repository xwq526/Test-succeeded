package test20201103;
//单链表实现的队列：链式队列         notice：这个实现可以看一下课件的，写的也可以。和自己写的有区别
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyQueue {
    public Node head;
    public Node tail;

    public void offer(int val) {
        //尾插法
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public int poll() {
        if (head == null) {
           throw new RuntimeException("队列为空");
        }
        int oldHead = head.val;
        if (head.next == null) {
            head = head.next;
            tail = tail.next;
        } else {
            head = head.next;
        }
        return oldHead;
    }

    public int peek() {
        if (head == null) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

}
public class TestDemo02 {
    public static void main(String[] args) {

    }
}
