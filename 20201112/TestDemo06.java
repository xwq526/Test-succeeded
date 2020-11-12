package test20201112;

import java.util.Arrays;

//快速排序
public class TestDemo06 {
    public static void main(String[] args) {
        //测试用
       /* int[] array = {6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(array));
        partion(array,0,array.length-1);
        System.out.println(Arrays.toString(array));*/


        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    /**
     * 时间复杂度：O（nlogn)  其实是knlogn   k比堆排序的小，所以快速排序比堆排序快。
     * 空间复杂度：O(logn)
     * 稳定性：不稳定的排序
     * @param array
     * @param low
     * @param high
     */
    public static void quick(int[] array, int low ,int high) {
        if (low >= high) return;//终止条件
        int par = partion(array,low,high);
        quick(array,low,par-1);//左边
        quick(array,par+1,high);//右边
    }
    //划分函数
    public static int partion(int[] array,int start ,int end) {
        int tmp = array[start];//这是基准
        while (start < end) {
            while (start < end && array[end] >=tmp) {
                end--;
            }
            if (start >= end) {
//                array[start] = tmp;
                break;
            } else {
                array[start] = array[end];
            }
            while (start < end && array[start] <= tmp) {
                start++;
            }
            if (start >= end) {
//                array[start] = tmp;
                break;
            } else {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }
    /*//下面是练习快速排序
    public static void quickSort1(int[] array) {
        quick1(array,0,array.length -1);
    }
    public static void quick1(int[] array, int low ,int high) {
        if (low >= high) return;
        int par = partion1(array,low,high);
        quick1(array,low,par-1);
        quick1(array,par + 1,high);
    }
    public static int partion1(int[] array,int start ,int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            if (start >= end) {
                array[start] = tmp;
                break;
            } else {
                array[start] = array[end];
            }
            while (start < end && array[start] <= tmp) {
                start++;
            }
            if (start >= end) {
                array[start] = tmp;
                break;
            } else {
                array[end] = array[start];
            }
        }
        array[start]= tmp;
        return start;
    }*/
}
