package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//4. 输出 1000 - 2000    (n)   之间所有的闰年
public class testDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int year= 1000; year <=n ; year++) {
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println(year);
            }
        }
    }
}
