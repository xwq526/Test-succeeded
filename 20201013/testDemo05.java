package com.company.Preview.day3.Test20201013;
import java.util.Arrays;
//题目名称：奇数位于偶数之前
//题目内容：调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class testDemo05 {
    public static void main(String[] args) {
        int[] a = {1,23,4,5,5,6,7,9,90,3};
        func(a);
        System.out.println(Arrays.toString(a));
    }
    public static void func(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            //left遇到奇数了
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            //right 遇到偶数了
            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
}


