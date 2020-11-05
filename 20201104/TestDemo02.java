package test20201104;
//225. 用队列实现栈      力扣    https://leetcode-cn.com/problems/implement-stack-using-queues/
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;
    private int usedSize;

    /** Initialize your data structure here. */
    public MyStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //1、谁不为空  入到哪个队列就好了
        //2、两个都为空   放到第一个qu1当中
       if (!qu1.isEmpty()) {
           qu1.offer(x);
       } else if (!qu2.isEmpty()) {
           qu2.offer(x);
       } else {
           qu1.offer(x);
       }
       usedSize++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()) {
            return -1;
        }
        int size = usedSize;//这句话很重要
        if (!qu1.isEmpty()) {
            for (int i = 0; i < size-1; i++) {//这里的size-1一定要用固定的值，否则直接用usedSize是会改变的，这是一个坑
                qu2.offer(qu1.poll());
            }
            usedSize--;
            return qu1.poll();

        } else {
            for (int i = 0; i < size-1; i++) {//这里的size-1一定要用固定的值，否则直接用usedSize是会改变的，这是一个坑
                qu1.offer(qu2.poll());
            }
            usedSize--;
            return qu2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if (empty()) {
            return -1;
        }
        int tmp = 0;
        int size = usedSize;
        if (!qu1.isEmpty()) {
            for (int i = 0; i < size; i++) {//这里的size一定要用固定的值，否则直接用usedSize是会改变的，这是一个坑
                tmp = qu1.poll();
                qu2.offer(tmp);
            }
        } else {
            for (int i = 0; i < size; i++) {//这里的size一定要用固定的值，否则直接用usedSize是会改变的，这是一个坑
                tmp = qu2.poll();
                qu1.offer(tmp);
            }
        }
        return tmp;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (qu1.isEmpty() && qu2.isEmpty()) {
            return true;
        }
        return false;
    }
}

public class TestDemo02 {
    public static void main(String[] args) {

    }
}
