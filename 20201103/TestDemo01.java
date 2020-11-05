package test20201103;

//数组实现栈
class MyStack {
    public int[] elem;
    public int top;//usedSize

    public MyStack() {
        this.elem = new int[5];
    }
    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("栈已经满了");
        }
        this.elem[top++] = item;
    }
    public int pop() {
        if (top == 0) {
            throw new RuntimeException("栈为空");
        }
        top--;
        return elem[top];
    }
    public int peek(){
        if (top == 0) {
            throw new RuntimeException("栈为空");
        }
        return elem[top-1];
    }
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (top < elem.length) {
            return false;
        }
        return true;
    }
}

public class TestDemo01 {

}