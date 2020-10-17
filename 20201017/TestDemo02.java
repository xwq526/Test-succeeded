package test20201017;
import java.util.Arrays;
//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
public class TestDemo02 {
    public static void main(String[] args) {
        int[] array = {1,2,48,69,4,56,7,7,4,34,5,8};
        int left = 0;
        int right = array.length-1;
        while (left < right){
                while (left < right && array[left]%2 != 0){
                    left++;
                }
                //
               while (left < right && array[right]%2 == 0){
                    right--;
                }
               if (left < right){
                   int tmp = array[left];
                   array[left] = array[right];
                   array[right] =tmp;
               }
        }
        System.out.println(Arrays.toString(array));




//        int left = 0;
//        int right = array.length-1;
//        while (left < right) {
//            while (left < right && array[left] % 2 != 0) {
//                left++;
//            }
//            //left遇到奇数了
//            while (left < right && array[right] % 2 == 0) {
//                right--;
//            }
//            //right 遇到偶数了
//            if(left < right) {
//                int tmp = array[left];
//                array[left] = array[right];
//                array[right] = tmp;
//            }
//        }
    }
}
