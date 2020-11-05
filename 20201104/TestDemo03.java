package test20201104;
//155. 最小栈     力扣        https://leetcode-cn.com/problems/min-stack/
import java.util.Stack;
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();//入
        minStack = new Stack<>();//出
    }

    public void push(int x) {
        //1、stack是一定需要放元素的
        //2、最小栈当中 是否存放数据   x<= 最小栈的栈顶元素
        if (stack.isEmpty()) {
            stack.push(x);
            minStack.push(x);
        } else {
            if (x <= minStack.peek()) {
                stack.push(x);
                minStack.push(x);
            } else {
                stack.push(x);
            }
        }
    }

    public void pop() {
        //1、stack是一定需要弹出元素的
        //2、最小栈当中 是否弹出数据    x  ==  最小栈的栈顶元素
        int temp = stack.pop();
        if (temp == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        //跟最小栈没有关系
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        //每次返回最小栈的栈顶元素
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}

public class TestDemo03 {
}
