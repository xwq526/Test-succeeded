package Test20201014;
//递归求 1 + 2 + 3 + ... + 10
public class TestDemo02 {
    public static void main(String[] args) {
        int a = 100;
        int ret = add(a);
        System.out.println(ret);
    }
    public static int add(int n){
        if (n==1){
            return 1;
        }
        return n+add(n-1);
    }
//    public static int add(int n){
//        if (n==1){
//            return 1;
//        }
//        int tmp=n+add(n-1);
//        return tmp;
//    }
}
