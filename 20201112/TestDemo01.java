package test20201112;

import java.util.Arrays;

//直接插入排序。
public class TestDemo01 {
    public static void main(String[] args) {
        int[] array = {10,7,3,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    /**
     * 时间复杂度：
     *          最好情况下: O（n)    数组中的数据是有序的
     *          最坏情况下：O（n^2)  数组中的数据是无序的
     * 空间复杂度：O（1)
     * 稳定性：稳定
     * 特点:越有序，越快。
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >=0; j--) {
                if (array[j] > tmp) {//小心不稳定    (>=)就是不稳定
                   array[j+1] = array[j];
                } else {
//                    array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    //下面是练习代码
    /*public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[i] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }*/
}
