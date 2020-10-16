package Test20201016;
//给定一个整型数组，找出其中的最大元素
public class TestDemo01 {
    public static void main(String[] args) {
        int[] a = {1,2,5,6,9,8,11,7,5,6};
        System.out.println(findMax(a));
    }
    public static int findMax(int[] a){
        if (a == null){
            return -1;
        }                       //数组一定要注意 array为null  和array.length=0的情况
        if (a.length == 0){
            return -1;
        }
        int max = a[0];
        for (int i = 1; i <a.length ; i++) {
            if (max<a[i]){
                max =a[i];
            }
        }
        return max;
    }
}
