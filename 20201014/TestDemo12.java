package Test20201014;
//递归求 1 + 2 + 3 + ... + 10
public class TestDemo12 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(add(n));
    }
    public static int add(int n){
        if (n==1){
            return 1;
        }
        return n+add(n-1);
    }
}
