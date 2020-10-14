package com.company.Preview.day3.Test20201012;
import java.lang.Math;
import java.util.Scanner;

//9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
public class testDemo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            //看这个数是几位数
            int count =0;
            int tmp=i;
            while (tmp!=0){
                tmp=tmp/10;
                count++;
            }
            int sum=0;
            tmp=i;
            while (tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp/=10;
            }
            if (sum==i){
                System.out.println(i+"是自幂数");
            }
        }
        scanner.close();
    }
    public static void main0(String[] args) {
        for (int i = 0; i < 999; i++) {
            int a = i%10;
            int a1 =i/10;
            int b = a1%10;
            int b1 = a1/10;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(b1,3)==i){
                if (i>=100) {
                    System.out.println(i);
                }
            }
        }

    }
}
