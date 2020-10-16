package Test20201015;
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
public class TestDemo05 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        pirntArray(a);
    }
    public static void pirntArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
