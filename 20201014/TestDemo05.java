package Test20201014;
//题目名称：求最大值方法的重载
//题目内容：在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
public class TestDemo05 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        double c=3.0;
        double d=1.0;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
        System.out.println(sum(c, d,b));
    }
    public static int sum(int a,int b){
        int max;
        max = a > b ? a : b;
        return max;
    }
    public static double sum(double a,double b){
        double max;
        max = a > b ? a : b;
        return max;
    }
    public static double sum(double a,double b,int c){
        double max1,max;
        max1= a > b ? a : b;
        double d=c;
        max= max1> d ? max1 : d;
        return max;
    }
}
