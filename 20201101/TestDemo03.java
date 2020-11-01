package test20201101;
//一行代码求两个数的最大公约数
public class TestDemo03 {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = gcd(a,b);
        System.out.println(c);
    }
    public static int gcd(int m ,int n) {
        return n == 0 ? m : gcd(n , m%n);
    }
}
