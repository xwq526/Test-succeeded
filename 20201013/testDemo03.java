package com.company.Preview.day3.Test20201013;

import java.util.Scanner;

//题目名称：求阶乘和
//题目内容：求1！+2！+3！+4！+........+n!的和
public class testDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int retsum = addsumu(n);
        System.out.println(retsum);
        sc.close();

    }
    public  static  int sumu(int n){
        int sum=1;
        for (int i = 1; i <=n ; i++) {
            sum =sum*i;
        }
        return sum;
    }
    public  static  int addsumu(int n){
        int a=0;
        for (int i = 1; i <=n; i++) {
            a+=sumu(i);
        }
        return a;
    }
}
