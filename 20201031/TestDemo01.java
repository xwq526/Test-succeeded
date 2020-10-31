package test20201031;
//写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
import java.util.*;
public class TestDemo01 {
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        // write code here
        char[] ch = str.toCharArray();
        int l =0;
        int r = ch.length-1;
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return String.valueOf(ch);
    }
}