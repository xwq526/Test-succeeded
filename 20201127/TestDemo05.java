package test20201127;
//493. 翻转对    https://leetcode-cn.com/problems/reverse-pairs/
//给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对。
//  你需要返回给定数组中的重要翻转对的数量。
public class TestDemo05 {
        public static int reversePairs(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            return mergSort(nums,0,nums.length-1);
        }
        public static int mergSort(int[] array,int left,int right) {
            if (left == right) {
                return 0;
            }
            int mid = (left +right) /2;
            return mergSort(array,left,mid)+mergSort(array,mid+1,right)+merge(array,left,mid,right);
        }
        public static int merge(int[] array,int left,int mid,int right) {
            int[] tmpArr = new int[right-left+1];
            int num = 0; // 翻转对数量
            int i = left;
            int j = mid+1;
            // j先固定在m+1位置不动，i在左组中向右滑动，先定位到第1个满足翻转对条件的i位置
            while (i <= mid && array[i] <= (long)2*array[j]) { // 【注意】：num为整型范围，乘以2可能溢出
                i++;
            }
            // i从第1个满足条件的位置开始向右滑动，每次滑动1个位置，结算每个i位置的翻转对数量
            while (i <= mid) {
                // 此时(i,j)是符合条件的，j在右组中继续向右滑动，继续向右扩，看在此时i不动的情况下，j最多能向右扩到哪里
                while (j <= right && array[i] > (long)2*array[j]) { // 【注意】：num为整型范围，乘以2可能溢出
                    j++;
                }
                // 此时，j来到右组中第一个不满足条件的位置，找到了在此时i的情况下，能产生的翻转对数量：
                num += (j - mid - 1);
                // 此时的i位置已经结算完答案，i向右滑动一个位置，尝试下一个i，能产生多少个翻转对
                i++;
            }
            int s1 = left;
            int s2 = mid+1;
            int k =0;
            while (s1 <= mid && s2 <= right) {
                if (array[s1] <= array[s2]) {
                    tmpArr[k++] = array[s1++];
                }else {
                    //这是不行的，如果这时的array[s1] >array[s2] 但是array[s1] 并不大于 2*array[s2]，
                    // 这时就把array[s2]放进tmpArr数组了。这样就漏掉了
                    //例如  2 3     1 3          这时就把 1 放进去了，并没有 取到（3，1）情况，
                    // if ((long)array[s1] > 2*(long)array[s2]) {
                    //     count += (mid - s1 +1);
                    // }
                    tmpArr[k++] = array[s2++];
                }
            }
            while (s1 <= mid) {
                tmpArr[k++] = array[s1++];
            }
            while (s2 <= right) {
                tmpArr[k++] = array[s2++];
            }
            for (int h = 0; h < tmpArr.length; h++) {
                array[left++] = tmpArr[h];
            }
            return num;
        }
    public static void main(String[] args) {
        int[] array = {1,3,2,3,1};
        int[] array2 = {4,5,6,1,2};
        System.out.println(reversePairs(array2));

    }

}
class Solution {//通过的
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return mergSort(nums,0,nums.length-1);
    }
    public int mergSort(int[] array,int left,int right) {
        if (left == right) {
            return 0;
        }
        int mid = (left +right) /2;
        return mergSort(array,left,mid)+mergSort(array,mid+1,right)+merge(array,left,mid,right);
    }
    public int merge(int[] array,int left,int mid,int right) {
        int[] tmpArr = new int[right-left+1];
        int num = 0; // 翻转对数量
        int i = left;
        int j = mid+1;
        while (i <= mid) {
            // 此时(i,j)是符合条件的，j在右组中继续向右滑动，继续向右扩，看在此时i不动的情况下，j最多能向右扩到哪里
            while (j <= right && array[i] > (long)2*array[j]) { // 【注意】：num为整型范围，乘以2可能溢出
                j++;
            }
            // 此时，j来到右组中第一个不满足条件的位置，找到了在此时i的情况下，能产生的翻转对数量：
            num += (j - mid - 1);
            // 此时的i位置已经结算完答案，i向右滑动一个位置，尝试下一个i，能产生多少个翻转对
            i++;
        }
        int s1 = left;
        int s2 = mid+1;
        int k =0;
        while (s1 <= mid && s2 <= right) {
            if (array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                tmpArr[k++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= right) {
            tmpArr[k++] = array[s2++];
        }
        for (int h = 0; h < tmpArr.length; h++) {
            array[left++] = tmpArr[h];
        }
        return num;
    }
}