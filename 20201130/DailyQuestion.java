package test20201130;
//每日一题
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class DailyQuestion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n > 1000) n = 1000;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < n; i++) {
            queue.add(i);
        }
        while(queue.size()> 1){
            int count = 0;
            while(count++ < 2){
                queue.add(queue.peek());
                queue.poll();
            }
            queue.poll();
        }
        System.out.println(queue.peek());
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] strarr = str.split(" ");
            int[] array = new int[strarr.length];
            for (int i = 0; i < strarr.length; i++) {
                array[i] = Integer.parseInt(strarr[i]);
            }
            PriorityQueue priorityQueue = new PriorityQueue(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            int k = array[array.length-1];
            int [] ret = new int[k];
            for (int i = 0; i < array.length-1; i++) {
                priorityQueue.add(array[i]);
                if (priorityQueue.size()>k){
                    priorityQueue.poll();
                }
            }
            for (int i = 0; i < k; i++) {
                ret[i] = (int) priorityQueue.poll();
            }
            for (int i = ret.length-1; i >= 0; i--) {
                System.out.println(ret[i]+" ");
            }
        }

    }
}


