package com.company.Preview.day3.Test20201013;

import java.util.Arrays;

//题目名称：奇数位于偶数之前
//题目内容：调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class testDemo05 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int i;
        int j;
        for(i=0;i<arr.length;i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 != 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}

