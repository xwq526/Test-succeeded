package test20201102;
//997. 找到小镇的法官   力扣  https://leetcode-cn.com/problems/find-the-town-judge/
public class TestDemo11 {
}
/*
class Solution {
    public int findJudge(int N, int[][] trust) {
        int inDegree[] = new int[N +1];//n-1
        int outDegree[] = new int[N +1];//0
        for (int[] path:trust) {
            inDegree[path[1]]++;
            outDegree[path[0]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (outDegree[i] == 0 && inDegree[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
*/



 /*   public int findJudge(int N, int[][] trust) {
        int[] counter = new int[N + 1];
        for (int[] idx : trust) {
            counter[idx[0]]--; // 出度
            counter[idx[1]]++; // 入度
        }
        for (int i = 1; i <= N; i++) {
            // 法官的 入度 - 出度 等于 N - 1
            // 其中出度为 0
            if (counter[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }*/