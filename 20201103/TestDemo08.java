package test20201103;

import java.util.Arrays;
import java.util.Stack;

//682. 棒球比赛   力扣           https://leetcode-cn.com/problems/baseball-game/
/*class Solution {//已经通过
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String str: ops) {
            if (str.equals("+")) {
                int tmp1 = stack.pop();
                int tmp2 = stack.peek();
                int tmp = tmp1 + tmp2;
                stack.push(tmp1);
                stack.push(tmp);
            } else if (str.equals("D") ) {
                stack.push(2 * stack.peek());
            } else if (str.equals("C")) {
                stack.pop();
            }else {
                stack.push(Integer.valueOf(str));
            }
        }
        int num = 0;
        while (!stack.isEmpty()) {
            num += stack.pop();
        }
        return num;
    }
}*/
public class TestDemo08 {
}
