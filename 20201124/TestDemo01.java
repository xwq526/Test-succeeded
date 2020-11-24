package test20201124;

import java.util.*;
//数据结构测试
public class TestDemo01 {
    /*public static int func (String paragraph,Set<String> set) {
        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()){
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (sb.length() > 0){
                String word = sb.toString();
                set.add(word);
                sb = new StringBuilder();
            }
        }
        return set.size();
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        //找n左右的两个数
        while (n >= b) {
            int c = a+b;
            a = b;
            b =c;
        }
        if ( b-n > n-a) {
            System.out.println(n-a);
        } else {
            System.out.println(b-n);
        }
    }











    public static void main1(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.nextLine();
            String array[] = s1.split(" ");
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
        }
        System.out.println(set.size());

    }

}
