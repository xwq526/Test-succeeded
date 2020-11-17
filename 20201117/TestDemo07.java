package test20201117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//350. 两个数组的交集 II   https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
public class TestDemo07 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //哈希表的解法
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums1) {
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int y : nums2) {
            if (map.containsKey(y)) {
                list.add(y);
                int count = map.get(y);
                count = count - 1;
                map.remove(y);
                if (count > 0) {
                    map.put(y,count);
                }
            }
        }
        int[] array = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }
        return array;






        /*//先排序的解法
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i]  < nums2[j]) {
                i++;
            }else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] array = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }
        return array;*/

    }
    public static void main(String[] args) {

    }
}
