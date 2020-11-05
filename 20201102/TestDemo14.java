package test20201102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1260. 二维网格迁移  力扣     https://leetcode-cn.com/problems/shift-2d-grid/
//方法一：暴力牛逼解法
/*class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List res = new ArrayList();
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[(i + (j + k) / n) % m][(j + k) % n] = grid[i][j];  //要记得这个公式和这种解法
            }
        }
        res = Arrays.asList(arr);  //aslist这个方法要牢记。
        return res;   //这里返回的并不是嵌套的list，

    }
}*/
//方法二：已经通过
/*class Solution {
    //思路是：找到右移后数组第一个元素 在原来数组中的位置，从这里开始遍历元素加入列表，列满行+1，行满行归零
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // 准备返回的列表
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i=0 ;i<grid.length;i++){
            ret.add(new ArrayList<>());
        }
        //
        k = k%(grid.length*grid[0].length);
        // 如果k是二维数组元素个数的倍数,说明数组没有变化,直接返回
        if(k==0){
            for(int i=0 ;i<grid.length;i++){
                for(int j=0 ;j<grid[0].length;j++){
                    ret.get(i).add(grid[i][j]);
                }
            }
        }
        // 就像计算时钟时间一样进制计算数组中元素位置
        else {
            int ColumnNum = grid.length;//行
            int RowNum = grid[0].length;//列
            // 数组右移几位,开始遍历的时候起始位置就是倒数几位
            int qishi= ColumnNum*RowNum-k;
            int line = qishi/grid[0].length;//行
            int row = qishi%grid[0].length;//列
            for(int i=0 ;i<grid.length;i++){
                for(int j=0 ;j<grid[0].length;j++){
                    ret.get(i).add(grid[line][row]);
                    row++;
                    // 进制
                    if(row==RowNum){
                        row = 0;
                        line++;
                    }
                    if(line==ColumnNum)
                        line=0;
                }
            }
        }
        return ret;
    }
}*/
public class TestDemo14 {
}
