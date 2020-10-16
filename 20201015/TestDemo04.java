package Test20201015;
// 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组素元上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
import java.util.Arrays;
public class TestDemo04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));
        int[] ret = transform(a);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] transform(int[] a){
        for (int i = 0; i <a.length ; i++) {
            a[i]= 2*a[i];
        }
        return a;
    }
}
