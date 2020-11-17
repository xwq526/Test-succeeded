package test20201117;
import java.util.*;
public class TestDemo04 {
//    坏键盘打字       https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String strMust = scan.nextLine();
            String strAct = scan.nextLine();
            func(strMust,strAct);
        }
    }
    public static void func(String s1 ,String s2) {
        //把实际输出的放进去set里面
        HashSet<Character> set1 = new HashSet<>();
        for (char ch : s2.toUpperCase().toCharArray()){
            set1.add(ch);
        }
        HashSet<Character> set2 = new HashSet<>();
        char[] ch2 = s1.toUpperCase().toCharArray();
        for (char ch: ch2) {
            if(!set1.contains(ch) && !set2.contains(ch)){
                set2.add(ch);
                System.out.print(ch);
            }
        }
    }

}
