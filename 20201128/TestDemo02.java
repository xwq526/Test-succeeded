package test20201128;
import java.util.*;
public class TestDemo02 {
    //题一
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strA = str.split(" ");
        int a = Integer.parseInt(strA[0]);
        int b = Integer.parseInt(strA[1]);
        System.out.println(a);
        System.out.println(b);
    }
//    不管是行还是列，只要有一个能够被4整除，蛋糕数就为网格总数的一半；如果行跟列都不能被4整除，蛋糕数等于网格总数除以2，再加上1。
    public static int maxNums(int a,int b) {
        int res = a*b/2;
        if (a % 4 == 0 || b % 4 == 0) {
            return res;
        }
        return res + 1;
    }
    //题二
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println(func(A,B));
    }
    public static int func (int a, int b){
        int m = a, n = b;
        int t = m % n;
        while(t != 0){
            m = n;
            n = t;
            t = m % n;
        }
        int max = a * b / n;
        return max;
    }

}
