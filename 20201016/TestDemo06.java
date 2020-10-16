package Test20201016;
import java.util.Arrays;
//给定一个整型数组, 实现冒泡排序(升序排序)
public class TestDemo06 {
    public static void main(String[] args) {
        int[] array = {1,3,45,5,6,643,9,7,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] a){
        boolean flg =false;
        for (int i = 0; i < a.length-1 ; i++) {
            flg = false;
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flg = true;
                }
            }
            if (!flg){
                break;
            }
        }
    }
}
