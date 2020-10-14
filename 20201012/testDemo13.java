package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//13. 输出一个整数的每一位.
public class testDemo13 {
    public static void main(String[] args) {//暂时是反序，顺序在后面
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        while (n!=0){
            System.out.println(n%10);
            n/=10;
        }
        sc.close();
    }

    public static void main0(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=sc.nextInt();
        while (a>0){
            int b=a%10;
            System.out.println(b);
            a=a/10;
        }
        sc.close();
    }
}
