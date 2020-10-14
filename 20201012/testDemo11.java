package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
public class testDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n=sc.nextInt();
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n=sc.nextInt();
        int count = 0;
        while (n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>>1;
        }
        System.out.println(count);
        sc.close();
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n=sc.nextInt();
        int count = 0;
        for (int i = 0; i < 31 ; i++) {
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
        sc.close();

    }
    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a=sc.nextInt();
        String str="";
        while (true) {
            str = a % 2 + str;
            a = a / 2;
            if (a == 0)
                break;
        }
        System.out.println(str);
        int num = Integer.parseInt(str);
        int count=0;
        while(num>0){
            if (num%10==1){
                count++;
            }
            num/=10;
        }
        System.out.println("二进制表示中1的个数有："+count+"个");
        sc.close();
    }
}
