package com.company.Preview.day3.Test20201012;

//6. 求两个正整数的最大公约数

    //思路：假如需要求 1997 和 615 两个正整数的最大公约数，用欧几里德算法，是这样进行的：
    //1997 / 615 = 3 (余 152)
    //615 / 152 = 4(余7)
    //152 / 7 = 21(余5)
    //7 / 5 = 1 (余2)
    //5 / 2 = 2 (余1)
    //2 / 1 = 2 (余0)
    //至此，最大公约数为1
    //以除数和余数反复做除法运算，当余数为 0 时，取当前算式除数为最大公约数，所以就得出了 1997 和 615 的最大公约数 1。
import java.util.Scanner;
public class testDemo06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while (a % b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }
        System.out.println("最大公约数是："+b);
    }
    public static void main0(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min,max,temp;
        min = a > b ? b : a;
        max = a > b ? a : b;//可以改进
        while (max%min != 0) {
            temp = max%min;
            max = min;
            min = temp;
        }
        if (min == 1) {
            System.out.println("这两个数互质.");
        } else {
            System.out.println(min);
        }
        sc.close();
    }
}
