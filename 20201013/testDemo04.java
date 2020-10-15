package com.company.Preview.day3.Test20201013;

import java.util.Scanner;

//题目名称：求 N 的阶乘 。
//题目内容：求 N 的阶乘 。
public class testDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int ret=sumu(n);
        System.out.println(ret);
        sc.close();
    }
    public  static  int sumu(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

}
