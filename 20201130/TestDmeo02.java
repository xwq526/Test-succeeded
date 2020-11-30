package test20201130;
//剑指 Offer 04. 二维数组中的查找   https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
public class TestDmeo02 {
    public static void main(String[] args) {

    }
    //这题比较经典，我们完全可以看作是二叉搜索树的遍历来解决。只要想到这一点就非常的简单了。
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
