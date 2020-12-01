package test20201201;
//面试题 08.06. 汉诺塔问题     https://leetcode-cn.com/problems/hanota-lcci/

//请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。你需要原地修改栈。
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-01
 * Time: 16:06:52
 */
public class HanoiTowerStack {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanotaHelper(A.size(),A,B,C);
    }
    public void hanotaHelper(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1){
            C.add(A.get(A.size()-1));
            A.remove(A.size()-1);
            return;
        }
        hanotaHelper(n-1,A,C,B);
        C.add(A.get(A.size() - 1));
        A.remove(A.get(A.size() - 1));
        hanotaHelper(n - 1, B, A, C);
    }
}
