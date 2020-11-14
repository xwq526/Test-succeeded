package test20201114;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;

//373. 查找和最小的K对数字   力扣
class Solution {
    //定义一个类描述数对
    static class Pair{
        public int num1;
        public int num2;
        public int sum;
        public Pair(int num1,int num2){
            this.num1 = num1;
            this.num2 = num2;
            this.sum = num1 + num2;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if( k<= 0){
            return result;
        }
        //准备一个堆，指定一个比较器对象  (小堆）
        PriorityQueue<Pair> pairPriorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.sum - o2.sum;
            }
        });
        //暴力法 （把所有的数对都放进去）
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                pairPriorityQueue.offer(new Pair(nums1[i] ,nums2[j]));
            }

        }
        //构造出所有的数对，放进去
        for (int i = 0; i < k && !pairPriorityQueue.isEmpty(); i++) {
            Pair cur = pairPriorityQueue.poll();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(cur.num1);
            tmp.add(cur.num2);
            result.add(tmp);
        }
        return result;
    }
}


public class TestDemo01 {
    public static void main(String[] args) {

    }
}
