package test20201126;
import java.util.*;
public class TestDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int count = func(n);
            System.out.println(n);
        }
    }
    public static int func(int n) {
        if (n % 2 != 0) {
           return -1;
        }
        if (n < 6) {
            return -1;
        }
        if (n==10 ) {
            return -1;
        }
        //此时是偶数
        int a = n % 8;   //0，2，4，6，
        if(a == 0) {
            return n/8;
        }else  {
            return n/8 + 1;
        }
    }



    public static void main2(String[] args) {//通过
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
           String  str1 = scanner.nextLine();
           String  str2 = scanner.nextLine();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str1.charAt(i));
                if (!str2.contains(sb.toString())){
                    res.append(str1.charAt(i));
                }
            }
            System.out.println(res);
        }
    }
}
