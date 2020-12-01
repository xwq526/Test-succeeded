package test20201201;
//每日一题
import java.util.*;
public class DailyQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            n = n/5;
            count += n;
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(func(a));
    }
    public static String func(int a){
        StringBuilder sb = new StringBuilder();
        while (a != 0){
            int tmp = a % 10;
            sb.append(tmp);
            a = a/10;
        }
        return sb.toString();
    }
}