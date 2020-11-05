package test20201103;

import java.util.LinkedList;
import java.util.Queue;

//933. 最近的请求次数    力扣    https://leetcode-cn.com/problems/number-of-recent-calls/

class RecentCounter {//已通过
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList();
    }
    public int ping(int t) {
        q.add(t);
        while ((q.peek() + 3000) < t) {
            q.poll();
        }
        return q.size();
    }
}
public class TestDemo12 {
}
