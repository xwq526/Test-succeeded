package test20201113;

import java.util.Arrays;


//快排优化版
public class TestDemo05 {
    //直接插入的调用
    public static void insertSort(int[] array,int low,int high) {
        for (int i = low + 1; i <= high; i++) {//注意这里是 i <= high
            int tmp = array[i];
            int j = i - 1;
            for (; j >= low; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    public static void swap(int[] array, int low ,int high) {
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
    }
    //三数取中
    public static void medianOfThree(int[] array,int low,int high) {
        //我们要的是这个array[mid] < array[low] < array[high]
        int mid = (low + high) / 2;
        if (array[low] >= array[high]) {
            swap(array,low,high);
        }
        if (array[mid] >= array[low]) {
            if (array[mid] < array[high]) {
                swap(array,low,mid);
            } else {
                swap(array,mid,high);
                swap(array,mid,low);
            }
        }
    }
    //划分函数
    public static int partion(int[] array,int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            if (start >= end) {
                break;
            } else {
                array[start] = array[end];
            }
            while (start < end && array[start] <= tmp) {
                start++;
            }
            if (start >= end) {
                break;
            } else {
                array[end] = array[start];
            }
        }
        array[start] =tmp;
        return start;
    }
    /**
     * 时间复杂度：O（n*logn)
     *               最坏： 有序   逆序的     顺序   O（n^2)
     * 空间复杂度：O（logn)
     * 稳定性：不稳定的排序
     */
    public static void quick(int[] array, int low ,int high) {
        if (low >= high) return;
        //优化1： 当 low high  之间的数据个数  小于某个值的时候  采用直接插入排序
        if (high - low + 1 <= 100) {
            insertSort(array,low,high);
            return;
        }
        //优化2： 三数取中
        medianOfThree(array,low,high);


        int par = partion(array,low,high);
        partion(array,low,par-1);
        partion(array,par+1,high);
    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length - 1);
    }

    public static void main(String[] args) {
        int[] array2 = {12,5,9,34};
        int[] array = {12,5,9,34,45,6,77,8,8,98,99,9,9,9,9,54,5,563,7,7};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }
}
