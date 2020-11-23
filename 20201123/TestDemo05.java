package test20201122;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//存在重复元素
public class TestDemo05 {
//    给定一个整数数组和一个整数k,判断数组中是否存在两个不同的索引i和j,使得nums [i] = nums [j]，并且i和j的差的绝对值至多为k。
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
   /* 在整数数组 nums 中，是否存在两个下标 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
    如果存在则返回 true，不存在返回 false。*/
    //这题题解是可以是桶排序。暂时空着哈！！！
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        return false;
    }
    public static void main(String[] args) {

    }
}
