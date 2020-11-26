package test20201126;

//面试题 17.18. 最短超串        https://leetcode-cn.com/problems/shortest-supersequence-lcci/
import java.util.*;

public class TestDemo04 {

    public int[] shortestSeq(int[] big, int[] small) {
        //左右双指针表示滑动窗口，start和min用来保存最优解
        int left = 0;
        int right = 0;
        int start = 0;
        int count = 0; //count用来保存匹配的个数
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> window = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : small) {
            map.put(x,map.getOrDefault(x,0) +1);
        }
        //移动right扩大窗口
        while (right < big.length) {
            int a = big[right];
            if (map.containsKey(a)) {
                window.put(a,window.getOrDefault(a,0) +1);
                if (window.get(a) == map.get(a)) {
                    count++;
                }
            }
            right++;
            //直到满足的时候  要开始缩小左边
            while (count == map.size()) {
                //更新最小窗口
                if ((right - left) < min) {
                    start = left;
                    min = right -left;
                }

                int b = big[left];
                if (map.containsKey(b)) {
                    window.put(b,window.getOrDefault(b,0) -1);
                    if (window.get(b) < map.get(b)) {
                        count--;
                    }
                }
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return new int[0];
        }
        return new int[]{start,min+start-1};
    }

    public static void main(String[] args) {
        int[] a = {7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7};
        int[] b = {1,5,9};

        int[] c = {1,2,3};
        int[] d = {4};
        System.out.println(Arrays.toString(shortestSeq4(a,b)));
        System.out.println(Arrays.toString(shortestSeq4(c,d)));
    }
    public static int[] shortestSeq4(int[] big, int[] small) {
        //左右双指针表示滑动窗口，start和min用来保存最优解
        int left = 0,right = 0,start = 0;
        int min = Integer.MAX_VALUE;
        //window用来记录当前窗口包含的字符和出现的次数
        //needs用来记录small当中出现的字符和包含的次数
        HashMap<Integer,Integer> window = new HashMap<>();
        HashMap<Integer,Integer> needs = new HashMap<>();
        //记录small中出现的字符和包含的次数
        for(Integer c:small ) needs.put(c,needs.getOrDefault(c,0)+1);
        //match用来保存匹配的个数
        int match = 0;
        //移动right扩大窗口
        while(right<big.length){
            Integer c1 = big[right];
            if(needs.containsKey(c1)){
                window.put(c1,window.getOrDefault(c1,0)+1);
                if(window.get(c1)==needs.get(c1)){
                    match++;
                }
            }
            right++;
            //当匹配个数满足small时，移动 left 缩小窗口进行优化
            while (match==needs.size()){
                //更新最小窗口
                if(right-left<min){
                    start = left;
                    min = right-left;
                }
                Integer c2 = big[left];
                if(needs.containsKey(c2)){
                    window.put(c2,window.getOrDefault(c2,0)-1);
                    if(window.get(c2)<needs.get(c2)){
                        match--;
                    }
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE? new int[0]:new int[]{start,min+start-1};
    }
}
