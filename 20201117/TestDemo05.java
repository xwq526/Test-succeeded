package test20201117;


import java.util.HashMap;
import java.util.Map;

//205. 同构字符串   力扣
public class TestDemo05 {
    //通过哈希表的方法
    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<n; ++i) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map.containsKey(ch1)) {//判断是不是有key，有的话判断value
                if(map.get(ch1) != ch2) {
                    return false;
                }
            }
            else if(map.containsValue(ch2)){//由于没有key对应，所以应该是一个新的，那么新的的value也必须是新的，不然就要false
                return false;
            }
            map.put(ch1, ch2);
        }
        return true;
    }
    //用字符串的方法
    public boolean isIsomorphic1(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        //通过判断位置值来判断是不是同构
        for (int i = 0; i < ch1.length; i++) {
            if (s.indexOf(ch1[i]) != t.indexOf(ch2[i])) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(t, s));
    }
}
