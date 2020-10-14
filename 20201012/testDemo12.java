package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//12. 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
public class testDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        for (int i = 31; i >=1 ; i-=2) {
            //偶数位   （左边开始）
            System.out.println(((n>>i)&1)+"");
        }
        for (int i = 30; i >=0; i-=2) {
            //奇数位   （左边开始）
            System.out.println(((n>>i)&1)+"");
        }
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
        int num = Integer.parseInt(str);
        System.out.println("二进制为:"+num);
        int b = str.length()-1;
        String str1="";
        String str2="";
        for (int i = 1; i <= b; i+=2) {
            str1 += str.charAt(i);
        }
        for (int i = 1; i <= b; i+=2) {
            str2 += str.charAt(i);
        }
        System.out.println("偶数位:"+str1);
        System.out.println("奇数位:"+str2);
        sc.close();
    }
}
