package test20201103;
//641. 设计循环双端队列   力扣     https://leetcode-cn.com/problems/design-circular-deque/

class MyCircularDeque {//已经通过
    private int elem[];
    private int front;
    private int rear;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        elem = new int[k+1];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {//头插法
        if (isFull()) {
            return false;
        }
        front = (front - 1 + this.elem.length) % this.elem.length;
        elem[front] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {//尾插法
        if (isFull()) {
            return false;
        }
        this.elem[rear] = value;
        rear = (rear + 1) % this.elem.length;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % this.elem.length;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + elem.length) % elem.length;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        int index = (rear - 1 + this.elem.length) % this.elem.length;
        return this.elem[index];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
       return front == rear;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
       return (this.rear + 1) % this.elem.length == front;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
public class TestDemo09 {
}
