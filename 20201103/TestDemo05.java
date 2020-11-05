package test20201103;
import java.util.Stack;

//150. 逆波兰表达式求值             https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
public class TestDemo05 {

}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int a, b;
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                int add = a + b;
                stack.push(b + a);
            } else if (s.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);//这个a，b是有顺序要求的
            } else if (s.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b * a);
            } else if (s.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
//数组解法：
//数组最大长度为tokens.length / 2 + 1
//switch代替if-else，效率优化
//Integer.parseInt代替Integer.valueOf,减少自动拆箱装箱操作


/*
class Solution {
    //纯数组模拟栈实现(推荐)   3 ms	36 MB
    public static int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    // numStack[index++] = Integer.valueOf(s);
                    //valueOf改为parseInt，减少自动拆箱装箱操作
                    numStack[index++] = Integer.parseInt(s);
                    break;
            }
        }
        return numStack[0];
    }
}*/
