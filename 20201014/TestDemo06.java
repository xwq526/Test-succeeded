package Test20201014;
//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
public class TestDemo06 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        double c=1.0;
        double d=1.0;
        double e=1.0;
        System.out.println(twoSum(a, b));
        System.out.println(threeSum(c, d, e));
    }
    public static int twoSum(int a,int b){
        return a+b;
    }
    public static double threeSum(double a,double b,double c){
        return a+b+c;
    }
}
