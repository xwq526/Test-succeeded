package test20201103;
//844. 比较含退格的字符串         https://leetcode-cn.com/problems/backspace-string-compare/

import java.util.Stack;
//双指针   逆序的
/*class Solution {   有时间好好解读一下，
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }
}*/

//通过重构字符串 用StringBuffer  顺序的
/*class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    public String build(String str) {
        StringBuffer ret = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            char ch = str.charAt(i);
            if (ch != '#') {
                ret.append(ch);
            } else {
                if (ret.length() > 0) {
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }
}*/

/*class Solution {//下面这个的改版   都是利用栈来做的题目。
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = func(S);
        Stack<Character> stack2 = func(T);
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            stack1.pop();
            stack2.pop();
        }
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
    public Stack<Character> func(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '#' ) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(S.charAt(i));
            }
        }
        return stack;
    }
}*/

/*class Solution {//已经通过，但是太low
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = func(S);
        Stack<Character> stack2 = func(T);
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            stack1.pop();
            stack2.pop();
        }
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
    public Stack<Character> func(String S) {
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '#' && (stack.peek() != 'A')) {
                stack.pop();
            } else {
                if (S.charAt(i) != '#') {
                    stack.push(S.charAt(i));
                }
            }
        }
        return stack;
    }
}*/

public class TestDemo07 {
}
