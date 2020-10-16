package Test20201015;
//创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
import java.util.Arrays;
public class TestDemo06 {
    public static void main(String[] args) {
        int [] a = new int[100];
        for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }
}