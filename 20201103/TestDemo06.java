package test20201103;
//栈的压入、弹出序列   牛客     https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&&tqId=11174&rp=1&ru=/activity/oj&qru=/ta/coding-interviews/question-ranking
import java.util.Stack;

/*public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[cur]) {
                stack.pop();
                cur++;
            }
        }
        return stack.isEmpty();
    }
}*/

public class TestDemo06 {
}
