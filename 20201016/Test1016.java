package Test20201016;
import java.util.Arrays;
//数组拷贝：下面的都是深拷贝
public class Test1016 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));

        int[] newArr = Arrays.copyOfRange(array, 2, 4);
        //有范围的[2,4)   都是左闭右开  顾头不顾腚
        System.out.println("newArr1: " + Arrays.toString(newArr));

//        int[] copy =new int[array.length];
//        System.arraycopy(array,0,copy,0,array.length);
//        System.out.println(Arrays.toString(copy));


//        int[] copy = Arrays.copyOf(array,2);
//        System.out.println(Arrays.toString(copy));


//        int[] copy = copyOf(array);
//        System.out.println(Arrays.toString(copy));
    }
    public static int[] copyOf(int[] a){
        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i]=a[i];
        }
        return copy;
    }
}
