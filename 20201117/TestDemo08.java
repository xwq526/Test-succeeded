package test20201117;

import java.util.HashMap;
import java.util.Map;

//387. 字符串中的第一个唯一字符  https://leetcode-cn.com/problems/first-unique-character-in-a-string/
public class TestDemo08 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) ==  1) {
                return i;
            }
        }



        //没有什么用，想复杂了
//        StringBuilder sb = new StringBuilder();
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            if (entry.getValue() == 1) {
//                sb.append(entry.getKey());
//            }
//        }
//        String str = sb.toString();
//        if (str.length() > 0) {
//            for (char ch : s.toCharArray()) {
//                if (str.contains("ch")){
//                    return s.indexOf("ch");
//                }
//            }
//        }
        return -1;

    }
    public static void main(String[] args) {

    }
}
