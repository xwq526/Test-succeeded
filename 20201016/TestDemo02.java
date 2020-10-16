package Test20201016;
//二分查找
public class TestDemo02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int a = binarySearch(array,6);
        System.out.println(a);
    }
    public static int binarySearch(int[] a ,int n){
        int left = 0;
        int right = a.length-1;
        while (left <= right){
            int mid = (right + left)/2;
            if (n > a[mid]){
                left = mid + 1;
            }else if (n < a[mid]){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

