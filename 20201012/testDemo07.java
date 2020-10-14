package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
public class testDemo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flg=1;
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + (1.0 / i) * flg;
//            sum+=(1.0 / i) * flg;
            flg=-flg;
        }
        System.out.println(sum);
    }
    public static void main0(String[] args) {
        double sum=1.0;
        for (int i = 2; i <=100; i++) {
            if (i%2==0){
                sum-=(1.0/i);
            }else {
                sum+=(1.0/i);
            }
        }
        System.out.println(sum);
    }
}
