package test20201202;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-02
 * Time: 12:09:37
 */
public class DailyQuestion {
    public static void main(String[] args) {

    }
    public int countWays(int x, int y) {
        // write code here
//        if (x== 1 || y == 1){
//            return 1;
//        }
//        return countWays(x-1,y) + countWays(x,y-1);
        int [][] dp = new int[x+1][y+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i-1][j] +dp[i][j-1];
            }
        }
        return dp[x][y];
    }
}
