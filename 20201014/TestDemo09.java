package Test20201014;
import java.util.Scanner;
//递归求斐波那契数列的第 N 项  1 1 2 3 5 8 13 ....
public class TestDemo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n；");
        int n =scanner.nextInt();
        int ret = fib(n);
        System.out.println(ret);
        scanner.close();
    }
    public static int fib(int n){
        if (n<=0){
            System.out.println("你的输入不合法！");
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        int tmp=fib(n-1)+fib(n-2);
        return  tmp;
    }
}
