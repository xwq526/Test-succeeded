package test20201117;

import java.util.HashSet;

//771. 宝石与石头  力扣
public class TestDemo03 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        char[] chJ = J.toCharArray();
        for(char ch: chJ) {
            set.add(ch);
        }
        char[] chS = S.toCharArray();
        for(char chs : chS) {
            if (set.contains(chs)) {
                count++;
            }
        }
        return count;
    }










    public static void main(String[] args) {

    }
}
