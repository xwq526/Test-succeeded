package test20201112;

import java.util.Arrays;

//冒泡排序
public class TestDemo05 {
    public static void main(String[] args) {
        int[] array = {10,7,3,6,8};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {//这是比较的次数
            boolean flg = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if (!flg) {
                break;
            }
        }
    }
}
