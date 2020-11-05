package test20201102;
//1013. 将数组分成和相等的三个部分  力扣          https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
/*class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int sum = 0;
        for (int x:A) {
            sum += x;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int target = sum/3;
        int sum1 =0;
        int i = 0;
        for (; i < A.length; i++) {
            sum1 += A[i];
            if (sum1 == target) {
                break;
            }
        }
        if (sum1 != target) {
            return false;
        }
        int j = i + 1;
        while ( j < A.length-1) {
            sum1 += A[j];
            if (sum1 == target*2) {
                return true;
            }
            j++;
        }
        return false;
    }
}*/
public class TestDemo10 {
    
}