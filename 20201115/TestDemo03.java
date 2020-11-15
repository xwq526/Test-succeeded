package test20201115;
//归并排序


import java.util.Arrays;

public class TestDemo03 {
    public static void merge(int[] array , int low ,int high, int mid) {
        int s1 = low;
        int s2 = mid + 1;
        int[] tmpArr = new int[high - low + 1];
        int k = 0; //就是tmpArr的下标
        while (s1 <= mid && s2 <= high) {//两个都不为空
            if (array[s1] <= array[s2]) {
                tmpArr[k] = array[s1];
                k++;
                s1++;
            } else {
                tmpArr[k] = array[s2];
                k++;
                s2++;
            }
        }
        //结束whil之后可能有一个为空，一个不为空
        while (s1 <= mid) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= high) {
            tmpArr[k++] = array[s2++];
        }
        //此时的tmpArr存放的就是有序的的了
        for (int i = 0; i < tmpArr.length; i++) {
            array[low+i] = tmpArr[i];
        }
    }
    public static void mergeSortInternal(int[] array,
                                         int low,int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //开始合并，
        merge(array,low,high,mid);
    }

    /**
     * 时间复杂度：O（nlogn）
     * 空间复杂度：O（n）
     * 稳定性：稳定的排序
     * @param array
     */
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[] array = {12,5,9,34,0,0,1};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
