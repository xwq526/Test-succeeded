package test20201101;
//对于一个给定的字符串，我们需要在线性(也就是O(n))的时间里对它做一些变形。
// 首先这个字符串中包含着一些空格，就像"Hello World"一样，
// 然后我们要做的是把着个字符串中由空格隔开的单词反序，同时反转每个字符的大小写。
// 比如"Hello World"变形后就变成了"wORLD hELLO"。
//"This is a sample",16                  "SAMPLE A IS tHIS"
import java.util.*;
public class TestDemo04 {
    public String trans(String s, int n) {
        // write code here
        StringBuilder tempstr = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                tempstr.append(Character.toLowerCase(c));
            } else if (c >= 'a' && c <= 'z') {
                tempstr.append(Character.toUpperCase(c));
            } else {
                tempstr.insert(0, c);
                res.insert(0, tempstr);
                tempstr = new StringBuilder();
            }
        }
        res.insert(0, tempstr);
        return res.toString();
    }
}
/*
for(int i = 0; i < n; i++){
        char c = s.charAt(i);
        if(c>='a'&& c<='z')
        tempStr += Character.toUpperCase(c);
        else if(c>='A'&& c<='Z')
        tempStr += Character.toLowerCase(c);
        else{
        tempStr = c+tempStr;
        res = tempStr + res;
        tempStr="";
        }
        }
        res = tempStr+res;
        return res;*/