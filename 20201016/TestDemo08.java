package Test20201016;
//给定一个有序整型数组, 实现二分查找
//二分查找是基于有序的基础上的
public class TestDemo08 {
    public static void main(String[] args) {
        int[] array = {1,23,26,34,55,434};
        System.out.println(binarySearch(array,55));
    }
    public static int binarySearch(int[] a ,int key){
        int left = 0;
        int right = a.length-1;
        while (left<=right){
            int mid = (right+left)/2;
            if (a[mid] > key){
                right = mid-1;
            }else if(a[mid] < key){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
