package test20201113;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class TOPK {
    public static void topK(int[] array, int k) {
        //取前k个最小的元素
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            }else {
                int tmp = maxHeap.peek();
                if(array[i] <  tmp) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        System.out.println(maxHeap);






        //下面是一开始自己写的
        /*//取前5个最小的元素
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < array.length; i++) {
            while (k > 0) {
                maxHeap.offer(array[i]);
                k--;
            }
            if (k == 0) {
                if (maxHeap.peek() > array[i]) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }

            }
        }
        System.out.println(maxHeap);*/


    }
    public static void main(String[] args) {
        int[] array = {12,45,2,7,10,8,19,56,32};
        System.out.println(Arrays.toString(array));
        topK(array,5);

    }
}

