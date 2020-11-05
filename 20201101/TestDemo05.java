package test20201101;
//比较版本号

/*如果version1 > version2 返回1，如果 version1 < version2 返回-1，不然返回0.
输入的version字符串非空，只包含数字和字符.。.字符不代表通常意义上的小数点，只是用来区分数字序列。
例如字符串2.5并不代表二点五，只是代表版本是第一级版本号是2，第二级版本号是5.*/

//"0.1","1.1"              -1
import java.util.*;


public class TestDemo05 {
    /**
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public int compare (String version1, String version2) {
        // write code here
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        for (int i = 0,j = 0; i < n1 && j < n2;i++,j++) {
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[j]);
            if (a < b) {
                return -1;
            } else if (a > b) {
                return 1;
            }
        }
        return Integer.compare(n1, n2);
/*        if(n1 > n2) {
            return 1;
        } else if (n1 < n2) {
            return -1;
        } else {
            return 0;
        }*/
    }
}