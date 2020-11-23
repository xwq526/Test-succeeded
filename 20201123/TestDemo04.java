package test20201122;

import java.util.HashMap;
import java.util.Map;
//525. 连续数组   https://leetcode-cn.com/problems/contiguous-array/
//给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。
public class TestDemo04 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果此时的元素是1就加1，不是1就减1；
            count = count + (nums[i] == 1 ? 1 : -1);

            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
