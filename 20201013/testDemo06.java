package com.company.Preview.day3.Test20201013;
//题目名称：求最大值
//题目内容：创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
public class testDemo06 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int ret1=twoSumMax(a,b);
        System.out.println(ret1);
        int ret2=threeSumMax(a,b,c);
        System.out.println(ret2);
    }
    public static int twoSumMax(int a, int b){
        int max;
        max = a > b ? a : b;
        return max;
    }
    public static int threeSumMax(int a,int b,int c){
        int tmp=twoSumMax(a,b);
        int tmp1=twoSumMax(tmp,c);
        return tmp1;

    }
}
