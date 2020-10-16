package Test20201016;
import java.util.Arrays;
//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
public class TestDemo09 {
    public static void main(String[] args) {
        int[] array = {1,34,3,43,5,5,35,6,78,9};
        int[] copy = copyOf(array);
        copy[0] = 2;
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(array));
    }
    public static int[] copyOf(int[] a){
        int[] copy = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            copy[i] = a[i];
        }
        return copy;
    }
}
