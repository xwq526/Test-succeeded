package test20201103;
//循环队列
class MyCircularQueue {
    public int[] elem;
//    public int usedSize;
    public int front;
    public int rear;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.elem = new int[k + 1];//这里的k + 1 要注意  因为我们浪费了一个空间。
    }
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
            //判断是否为满
        if ((rear + 1) % this.elem.length == front) {
            return false;
        }
        //reat--》
        elem[rear] = value;
        rear = (rear + 1) % this.elem.length;
        return true;
    }
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        //判断是否为空
        // front和rear相遇的时候
        if (rear == front) {
            return false;
        }
        front =(front +1) % this.elem.length;
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() {
        if (rear == front) {
            return -1;
        }
        return this.elem[front];
    }
    /** Get the last item from the queue. */
    public int Rear() {
       //这里有坑，要小心
        if (front == rear) {
            return -1;
        }
        int index = this.rear == 0 ? this.elem.length -1 : this.rear-1;
        return  this.elem[index];
       /* int index = 0;
        if(this.rear == 0) {//这里比较特殊，要注意
            index = this.elem.length-1;
        }else {
            index = this.rear-1;
        }
        return this.elem[index];*/
    }
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if ((rear + 1) % this.elem.length == front) {
            return true;
        }
        return false;
    }
}

public class TestDemo03 {
}
