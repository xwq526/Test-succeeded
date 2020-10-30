package test20201030;
//给定一个字符串，请编写一个函数判断该字符串是否回文。如果回文请返回true，否则返回false。
import java.util.*;


public class TestDemo03 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串 待判断的字符串
     * @return bool布尔型
     */
    public boolean judge (String str) {
        // write code here
        if (str.length() == 0 || str == null) {
            return false;
        }
        int start = 0,end = str.length() - 1;
        while(start != end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
