package test20201105;

import java.util.Arrays;

//169. 多数元素   力扣    https://leetcode-cn.com/problems/majority-element/
//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于n/2的元素
//  你可以假设数组是非空的，并且给定的数组总是存在多数元素。

class Solution1 {//排序法（使用于众数）
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

class Solution {//Boyer-Moore 投票算法（特例）
    public int majorityElement(int[] nums) {
        int count = 0;
        int end = 0;
        for (int x : nums) {
            if(count == 0) {
                end = x;
            }
            count += (x == end) ? 1:-1;
        }
        return end;
    }
}


public class TestDemo05 {
}