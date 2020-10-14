package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//2. 判定一个数字是否是素数
public class testDemo02 {
    public static void main(String[] args) {
        //最终版
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println(n+"不是素数");
            return;
        }
        int i=2;
        for (; i <=Math.sqrt(n); i++) {
            if (n%i==0){
                System.out.println(n+"不是素数");
                break;
            }
        }
        if (i>Math.sqrt(n)){
            System.out.println(n+"是素数");
        }

    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println(n+"不是素数");
            return;
        }
        int i=2;
        for (; i <=n/2; i++) {
            if (n%i==0){
                System.out.println(n+"不是素数");
                break;
            }
        }
        if (i>n/2){
            System.out.println(n+"是素数");
        }

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println(n+"不是素数");
            return;
        }
        int i=2;
        for (; i <n; i++) {
            if (n%i==0){
                System.out.println(n+"不是素数");
                break;
            }
        }
        if (i>=n){
            System.out.println(n+"是素数");
        }
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=true;
        if (num<2){
            flag=false;
        }else {
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    flag=false;
                }
            }
        }
        if (flag){
            System.out.println(num+"是素数");
        }else{
            System.out.println(num+"不是素数");
        }
        sc.close();
    }
}
