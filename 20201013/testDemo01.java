package com.company.Preview.day3.Test20201013;
//题目名称：找出出现一次的数字
//题目内容：有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class testDemo01 {
    public static int findNum(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[]a={1,1,2,2,9,5,5,6,6,8,8};
        int ret=findNum(a);
        System.out.println(ret);















//        int []arr={1,1,2,2,4,3,4,5,5};
//        int i=0;
//        int j=0;
//        int count;
//        for(i=0;i<9;i++){
//            count =0;
//            for(j=0;j<9;j++){
//                if(arr[i]==arr[j])
//                    count ++;
//
//            }if(count==1){
//                System.out.println(arr[i]);
//            }
//        }

    }
}
