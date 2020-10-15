package Test20201014;
//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)           递归求解
public class TestDemo01 {
    public static void main(String[] args) {
        int a=1234;
        print(a);
    }
    public  static void print(int n){
        if (n<=9){
            System.out.print(n);
            return;
        }
        print(n/10);
        System.out.print(n%10);
    }
}
