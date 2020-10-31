package test20201031;
//以字符串的形式读入两个数字，编写一个函数计算它们的乘积，以字符串形式返回。
//        （字符串长度不大于10000，保证字符串仅由'0'~'9'这10种字符组成）
import java.util.*;

public class TestDemo02{
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s string字符串 第一个整数
     * @param t string字符串 第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int[] nums1 = new int[len1];
        int[] nums2 = new int[len2];

        for(int i = 0; i < len1; i++){
            nums1[i] = s.charAt(i) - '0';
        }
        for(int i = 0; i < len2; i++){
            nums2[i] = t.charAt(i) - '0';
        }

        int[] result = new int[len1 + len2];

        // 1. 逐位相乘
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                result[i + j] += nums1[i] * nums2[j];
            }
        }

        // 2. 从后往前进位
        for(int k = result.length - 1; k > 0; k--){
            result[k - 1] += result[k] / 10;
            result[k] = result[k] % 10;
        }

        //第一第二步非常的巧妙，要好好理解。
        // 输出字符串
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < result.length - 1; i++){
            stringBuilder.append(result[i]);
        }
        return stringBuilder.toString();
    }
}
