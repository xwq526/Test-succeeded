package Test20201014;
//写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9，它的和是19
public class TestDemo03 {
    public static void main(String[] args) {
        int n = 1729;
        System.out.println(sum(n));

    }
    public  static  int sum(int n) {
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
//    public  static  int sum(int n){
//        if (n<=9){
//            return n;
//        }
//        int ret=n%10+sum(n/10);
//        return ret;
//    }
}
