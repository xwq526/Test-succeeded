package test20201017;
import java.util.Arrays;
//给定两个整型数组, 交换两个数组的内容.
public class TestDemo03 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        exchange(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
    public static void exchange(int[] a1 , int[] a2){
        for (int i = 0; i < a1.length; i++) {
            int tmp = a1[i];
            a1[i] = a2[i];
            a2[i] = tmp;
        }
    }
}
