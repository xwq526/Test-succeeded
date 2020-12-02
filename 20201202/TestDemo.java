package test20201202;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-02
 * Time: 20:30:21
 */
public class TestDemo {
    public static void main(String[] args) {

    }
//    32. 最长有效括号   https://leetcode-cn.com/problems/longest-valid-parentheses/
    public int longestValidParentheses (String s) {
        // write code here
        int max = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                if (s.charAt(i-1) == '('){
                    dp[i] = ( i-2>0 ? dp[i-2] : 0) +2;
                }else if(i - dp[i-1] >0 && s.charAt(i-dp[i-1] -1) =='('){
                    dp[i] = dp[i-1] + (i-dp[i-1]-2 >= 0? dp[i-dp[i-1]-2]:0) +2;
                }
                max = Math.max(max,dp[i]);
            }
        }
        return max;

    }
}

