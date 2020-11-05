package test20201104;
//20. 有效的括号  力扣         https://leetcode-cn.com/problems/valid-parentheses/

import java.util.Stack;
public class TestDemo01 {
    public static boolean isValid(String s) {//已经通过。
        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()) {
            if (ch == '{')stack.push('}');
            else if (ch == '(')stack.push(')');
            else if (ch == '[')stack.push(']');
            else if (stack.isEmpty() || ch != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean isValid1(String s) {//已经通过
        Stack<Character> stack = new Stack<>();
        //只要再以下过程当中 发现不匹配  直接return
        for (int i = 0; i < s.length(); i++) {
            //1、左括号进行入栈
            char tmp = s.charAt(i);
            if (tmp == '(' || tmp == '[' || tmp == '{') {
                stack.push(tmp);
            } else {
                //2、判断栈是否为空
                if (stack.empty()) {
                    return false;
                } else {
                    //3、判断栈顶元素的字符左括号和当前的字符 右括号是否匹配
                    if ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') || (stack.peek() == '{' && s.charAt(i) == '}')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        //4、判断栈是否为空
        return stack.isEmpty();
    }
}