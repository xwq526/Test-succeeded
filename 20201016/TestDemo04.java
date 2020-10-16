package Test20201016;
import java.util.Arrays;
//冒泡排序
public class TestDemo04 {
    public static void main(String[] args) {
        int[] array = {1,67,3,8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] a) {//优化后的
        boolean flg = false;
        for (int i = 0; i < a.length - 1; i++) {
            flg = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flg = true;
                }
            }
            if (!flg) {
                break;
            }
        }
    }
    public static void bubbleSort1(int[] a){//没有优化的
        for (int i =0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    int tmp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
}
