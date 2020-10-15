package Test20201014;
//求斐波那契数列的第 N 项   递归
public class TestDemo04 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
