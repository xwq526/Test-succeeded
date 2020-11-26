package test20201126;

import java.util.*;

//给定一个数组arr，返回arr的最长的无重复子串的长度(无重复指的是所有数字都不相同)。
public class TestDemo01 {
    //方法一
    public int maxLength (int[] arr) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 1;
        for(int start = 0, end = 0; end<arr.length ; end++){
            if(map.containsKey(arr[end])){
                //重复了
                start = Math.max(start, map.get(arr[end])+1);
                //注意：这里一定要取最大的start，不然就错误了
                //为什么？ 因为重复数字的索引很可能比start小
            }
            max = Math.max(max , end-start+1);
            map.put(arr[end],end);
        }
        return max;

    }
    //方法二
    public int maxLength1 (int[] arr) {
    // write code here
        int maxLength = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++){
            while (list.contains(arr[i])){
                list.removeFirst();
            }
            list.add(arr[i]);
            if (list.size() > maxLength){
                maxLength = list.size();
            }
        }
        return maxLength;
    }
    //方法三   牛逼解法  好好琢磨
    public int maxLength2 (int[] arr) {
        int[] lastPos = new int[100005];
        int len = arr.length;
        int start = 0;
        int res = 0;
        for(int i =0;i<len;i++){
            int now = arr[i];
            start = Math.max(start,lastPos[now]);
            res = Math.max(res,i-start+1);
            lastPos[now] = i+1;
        }

        return res;
    }

    public static void main(String[] args) {
    }
}
