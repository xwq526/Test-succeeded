package test20201102;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //List<List<Integer>>      一个list里面放着list
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows <= 0) {
            return ret;//也可以是null，看题目要求
        }
        //第一行
        List<Integer> one = new ArrayList<>();
        one.add(1);
        ret.add(one);
        //第二行开始
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> preRow = ret.get(i-1);
            for (int j = 1; j < i; j++) {
                int tmp = preRow.get(j) + preRow.get(j-1);
                curRow.add(tmp);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
}
public class TestDemo06 {
    public static void main(String[] args) {

    }
}