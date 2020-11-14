package test20201114;
//165. 比较版本号   力扣


import java.util.Arrays;
import java.util.Comparator;

/*class compareVersionChild implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.parseInt(o1) - Integer.parseInt(o1);
    }
}*/
class Solution2 {

    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < Math.max(n1,n2); i++) {
            //如果没有那么多位数就用0来填
            int t1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
            int t2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;
            if (t1 != t2) {
                return t1 > t2 ? 1 :-1;
            }
        }
        return 0;
    }
}


public class TestDemo03 {
    public static int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < Math.max(n1,n2); i++) {
            //如果没有那么多位数就用0来填
            int t1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
            int t2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;
            System.out.println(" =======");
            if (t1 != t2) {
                return t1 > t2 ? 1 :-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String version1 = "0.1";
        String version2 = "1.0";
        System.out.println(compareVersion(version1,version2));

    }
}
