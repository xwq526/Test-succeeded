package test20201112;

import java.util.Arrays;

//希尔排序
public class TestDemo02 {
    public static void main(String[] args) {
        int[] array = {10,7,3,6,8};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >= 0; j = j -gap) {
                if (array[j] > tmp) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    //下面是练习代码
    public static void shell1(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i - gap;
            for (; j >= 0 ; j = j - gap) {
                if (array[j] > tmp) {
                    array[i] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    /**
     * 稳定性：不稳定排序
     * 时间复杂度：O（n^1.3 - n^1.5)
     * 空间复杂度：O（1）
     * @param array
     */
    public static void shellSort (int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }
}
