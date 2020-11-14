package test20201114;

import java.util.Comparator;
import java.util.PriorityQueue;
//最后一个石头的重量   力扣
class Solution1 {
    public int lastStoneWeight(int[] stones) {
        if (stones == null) return 0;
        //建立一个大堆，然后一次拿出两个，如果相等就返回直接继续拿两个，不相等就添加一个y-x就行；
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //遍历数组把每一个元素放进去
        for (int i = 0; i < stones.length; i++) {
            priorityQueue.offer(stones[i]);
        }
        while (priorityQueue.size() > 1) {
            int z = priorityQueue.poll() - priorityQueue.poll();
            priorityQueue.offer(z);
        }
        return priorityQueue.peek();
    }
}
//public class TestDmeo02 {
//    public static void main(String[] args) {
//
//    }
//}
