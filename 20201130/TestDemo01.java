package test20201130;
import java.util.*;
public class TestDemo01 {
    static class SortById implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            return o2 - o1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array1 = new Integer[n];
        Integer[] array2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
//        Integer[] array1 = {1,3,5,45,46,6,6,7};
//        Arrays.sort(array1, new SortById());
//        Arrays.sort(array1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        Arrays.sort(array2, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        int girl_score = 0;
        int boy_score = 0;
        int h = n-1;
        int k = n-1;
        //这里情况问题比较多。。。。可以试一下用两个队列来做一下可能更好理解
        /*for (int i = 0; i < n; i++) {   //这里是有问题的
            //妞妞先来
            if (h>=0 && k>=0 && array1[h] > array2[k]) {//如果妞妞大，拿走
                girl_score += array1[h--];
            }else {
                k--;
            }
            //牛牛来
            if (h>=0 && k>=0 && array1[h] < array2[k]){
                boy_score += array2[k--];
            }else {
                h--;
            }

        }*/
        System.out.println(girl_score -boy_score);



    }
}
