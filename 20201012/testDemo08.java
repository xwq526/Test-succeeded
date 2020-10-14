package com.company.Preview.day3.Test20201012;
//编写程序数一下 1到 100 的所有整数中出现多少个数字9。
public class testDemo08 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%10==9){
                count++;
            }else if (i/10==9){//注意这里和main1的区别（特别注意）
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%10==9){
                count++;
            }//注意这里和main的区别（特别注意）
            if (i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main0(String[] args) {
        int sum=0;
        for (int i = 0; i <101 ; i++) {
            if (i%10==9){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
