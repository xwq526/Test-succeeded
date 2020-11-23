package test20201122;

import java.util.Scanner;
//   day1   字符串
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(str);
            System.out.println(str2);
            System.out.println(isHuiWen(str));
        }

    }
    public static int func(String A,String B) {
        int count = 0;
       /* if(A == null && B == null) return 0;
        if(A.length() == 0 && B.length() == 0) return 0;
        if (A.length() != 0 && B.length() == 0){
            if (isHuiWen(A)) {
                count++;
            }
            return count;
        }
        if (A.length() == 0 && B.length() != 0){
            if (isHuiWen(B)) {
                count++;
            }
            return count;
        }*/

        for (int i = 0; i <= A.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(A.substring(0,i));
            sb.append(B);
            sb.append(A.substring(i,A.length()));
            if (isHuiWen(sb.toString())) {
                count++;
            }
        }
        return count;
    }
    public static boolean isHuiWen(String str) {
        if(str == null) return false;
        int len = str.length();
        if(len == 1) return true;
        for(int i = 0; i < str.length()/2; i++) {
            char head = str.charAt(i);
            char last = str.charAt(len - i - 1);
            if(head != last) {
                return false;
            }
        }
        return true;
    }
}
