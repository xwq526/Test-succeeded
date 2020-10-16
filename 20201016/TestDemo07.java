package Test20201016;
//给定一个整型数组, 判定数组是否有序（递增）
public class TestDemo07 {
    public static void main(String[] args) {
        int[] array = {1,23,4,34,4,2,4};
        int[] array1 = {1,2,4};
        System.out.println(judgment(array));
        System.out.println(judgment(array1));
    }
    public static boolean judgment(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
