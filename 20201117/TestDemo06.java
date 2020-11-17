package test20201117;
//349. 两个数组的交集      https://leetcode-cn.com/problems/intersection-of-two-arrays/

import java.util.HashSet;
import java.util.Iterator;

public class TestDemo06 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }
        HashSet<Integer> retset = new HashSet<>();
        for (int y : nums2) {
            if (set.contains(y) ) {
                retset.add(y);
            }
        }
        int[] array = new int [retset.size()];

        Iterator<Integer> it = retset.iterator();
        int i = 0;
        while (it.hasNext()) {
            array[i++] = it.next();
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
