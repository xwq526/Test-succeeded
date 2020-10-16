package Test20201016;
import java.util.Arrays;
//数组逆序
public class TestDemo05 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int left = 0;
        int right = a.length-1;
        while (left<right){
            int tmp =a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
