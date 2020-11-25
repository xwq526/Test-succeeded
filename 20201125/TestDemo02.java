package test20201125;
import java.util.*;
//判断是不是括号序列。
public class TestDemo02 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                stack.push(')');
            }else {
                if (A.charAt(i) == ')'&& !stack.isEmpty()) {
                    if (stack.peek() == ')') {
                        stack.pop();
                    }
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
