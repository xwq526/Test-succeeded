package test20201114;

import javax.swing.*;
import java.util.*;

//658. 找到 K 个最接近的元素 力扣

class Solution4 {//已经通过
    //这是用二分法找左边界
    public List<Integer> findClosestElements(int[] arr, int k, int x) {//自己写了一遍
        List<Integer> ret = new ArrayList<>();
        int left = 0;
        int length = arr.length;
        int right = arr.length-1;
        //进行二分法
        while (left < right) {
            int mid = (left + right)>>>1;
            if (mid + k >= length || Math.abs(arr[mid] - x) <= Math.abs(arr[mid+k] -x)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        for (int i = left; i < left+k; i++) {
            ret.add(arr[i]);
        }
        return ret;

        //答案
       /* List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int length = arr.length;
        int right = length - 1;
        while(left < right){
            int mid = (left + right) >>> 1;
            if(mid + k >= length || Math.abs(arr[mid] - x) <= Math.abs(arr[mid+k] - x)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        for(int i = left;i<left+k;i++){
            result.add(arr[i]);
        }
        return result;*/
    }
}

//下面是用优先级队列做的，有点瑕疵解决不了，有时间再解决
/*class Pair {
    public int num1;
    public int num2;
    public int del;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.del = Math.abs(num1 - num2);
    }
}
public class TestDemo04 {
    public static void main(String[] args) {
        int[] arr ={0,0,1,2,3,3,4,7,7,8};
        int k = 3;
        int x = 5;
        List list = findClosestElements(arr,k,x);
        System.out.println(list);
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.del - o2.del;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.offer(new Pair(arr[i],x));
        }
        int count = k;
        int tmp = 0;
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                Pair a = priorityQueue.poll();
                tmp = a.del;
                list.add(a.num1);
            }
            //这个是有问题的
            *//*if (i != 0 && !priorityQueue.isEmpty()) {
                Pair pair = priorityQueue.poll();
                if (tmp == pair.del) {
                    k++;
                }
                tmp = pair.del;
                list.add(pair.num1);
            }*//*
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        for (int i = 0; i < count; i++) {
            ret.add(array[i]);
        }
        return ret;
    }

}*/
