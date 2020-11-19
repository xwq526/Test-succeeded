package test20201119;
//给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。 牛客
//输入：  "1AB2345CD","12345EF"
//返回值： "2345"
import java.util.*;
public class test01 {
    //解法一
    public static String LCS (String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int end = 1;
        int start = 0;
        while (end < str1.length() + 1) {
            if (str2.contains(str1.substring(start,end))) {
                if (sb.length() < end-start) {
                    sb.delete(0,sb.length());
                    sb.append(str1,start,end);
                }
            }else {
                start++;
            }
            end++;
        }
        if (sb.length() == 0) {
            return "-1";
        }
        return sb.toString();
    }
    //解法二
    public static String LCS2(String str1, String str2) {
        if (str1 == null || str2 == null) return "-1";
        int n1 = str1.length(), n2 = str2.length();
        if (n1 == 0 || n2 == 0) return "-1";
        int[][] dp = new int[n1 + 1][n2 + 1];

        int maxLen = 0, x = 0;
        for (int i = 1; i <= n1; i++) {
            char ch1 = str1.charAt(i - 1);
            for (int j = 1; j <= n2; j++) {
                char ch2 = str2.charAt(j - 1);
                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        x = i;
                    }
                }
            }
        }
        return maxLen == 0 ? "-1" : str1.substring(x - maxLen, x);
    }
    public static void main(String[] args) {
        String str1 =  "1AB2345CD";
        String str2 =  "12345EF";
//        System.out.println(str1.substring(1,1));
//        System.out.println(str2.charAt(0));
        System.out.println(LCS(str1, str2));
    }
}
