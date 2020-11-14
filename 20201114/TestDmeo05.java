package test20201114;

import java.util.*;

//692. 前K个高频单词 力扣
public class TestDmeo05 {

    public List<String> topKFrequent(String[] words, int k) {//已经通过
        Map<String,Integer> map = new HashMap<>();
        //把元素放进map中
        for (String word : words) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        //建立一个堆（小根堆）根据次数比较的
       /* PriorityQueue<String> priorityQueue = new PriorityQueue<String>(((o1, o2) -> count.get(o1).equals(count.get(o2)) ?
                o2.compareTo(o1):count.get(o1) - count.get(o2)));*/
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>((o1, o2) -> {
            return map.get(o1) == map.get(o2) ?
                    o2.compareTo(o1) : map.get(o1) - map.get(o2);
        });
        for (String word:map.keySet()) {
            priorityQueue.offer(word);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        //因为是小根堆，所以第一个出队列的是最小的，所以要用头插法
        LinkedList<String> linkedList = new LinkedList<>();
        while (!priorityQueue.isEmpty()) {
            linkedList.addFirst(priorityQueue.poll());
        }
        return linkedList;
    }
    //官方解答
   /* class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> count = new HashMap();
            for (String word: words) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
            PriorityQueue<String> heap = new PriorityQueue<String>(
                    (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                            w2.compareTo(w1) : count.get(w1) - count.get(w2) );

            for (String word: count.keySet()) {
                heap.offer(word);
                if (heap.size() > k) heap.poll();
            }

            List<String> ans = new ArrayList();
            while (!heap.isEmpty()) ans.add(heap.poll());
            Collections.reverse(ans);
            return ans;
        }
    }*/
    public static void main(String[] args) {

    }
}
