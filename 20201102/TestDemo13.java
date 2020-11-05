package test20201102;
//707. 设计链表  力扣             https://leetcode-cn.com/problems/design-linked-list/
//单链表带头节点
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
class MyLinkedList {
    /** Initialize your data structure here. */
    public ListNode head;
    int size;
    public MyLinkedList() {
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = this.head;
        while (index+1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        //头插法
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode cur = head;
        ListNode node = new ListNode(val);
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class TestDemo13 {
}
