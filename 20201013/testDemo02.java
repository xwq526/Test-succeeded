package com.company.Preview.day3.Test20201013;

import java.util.Scanner;

//题目名称：斐波那契数
//题目内容：求斐波那契数列的第n项。(迭代实现)
public class testDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int ret = fonc(n);
        System.out.println(ret);
        sc.close();
    }
    public static int fonc(int n){
        int num=0;
        if(n==1||n==2){
            num=n;
        }
        int a=1;
        int b=1;
        for(int i=3;i<=n;i++){
            num=a+b;
            a=b;
            b=num;
        }return num;
    }
}
