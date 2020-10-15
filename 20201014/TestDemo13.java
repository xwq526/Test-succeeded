package Test20201014;
import java.util.Scanner;
//递归求 N 的阶乘
public class TestDemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入N：");
        int n = scanner.nextInt();
        System.out.println(sum(n));
        scanner.close();
    }
    public  static int sum(int n){
        if (n==1){
            return 1;
        }
        return n*sum(n-1);
    }
}
