package test20201128;

import java.util.Arrays;
import java.util.Comparator;
//剑指 Offer 45. 把数组排成最小的数  https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
public class TestDemo04 {
    //这是最小数，最大数也是一样的解法，改变一下compareto就行，注意元素时0的情况。
    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
//        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }
    public static void main(String[] args) {
        int[] array = {90,3,30,34,5,9};
        System.out.println(minNumber(array));
        String s1 = "303";
        String s2 = "330";
        System.out.println(s1.compareTo(s2));

    }
}
