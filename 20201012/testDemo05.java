package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//5. 输出乘法口诀表,由用户输入n
public class testDemo05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1;j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println("");
        }
        sc.close();
    }
}
