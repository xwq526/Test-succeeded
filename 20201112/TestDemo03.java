package test20201112;

import java.util.Arrays;

//选择排序
public class TestDemo03 {
    public static void main(String[] args) {
        int[] array = {10,7,3,6,8};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 时间复杂度：O（n^2)
     * 空间复杂度：O（1）
     * 稳定性，不稳定排序
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    //下面是练习
    /*public static void selectSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            
        }
    }*/
}
