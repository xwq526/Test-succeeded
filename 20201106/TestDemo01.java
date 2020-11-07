package test20201106;

import java.util.HashMap;
import java.util.Map;

//1. 两数之和   力扣     https://leetcode-cn.com/problems/two-sum/

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
class Solution {//哈希表解法
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
//还可以直接两个for循环暴力解法，这里就不作书写了。
public class TestDemo01 {

}
