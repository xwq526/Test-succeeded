package test20201029;
import java.util.Scanner;
/*输入描述：
 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
输出描述：
每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
输入：abcqweracb
输出：abcqwer*/
public class TestDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            StringBuffer str2 = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if (!str2.toString().contains(tmp+"")) {
                   str2.append(tmp);
                }
            }
            System.out.println(str2);
        }
    }
}
