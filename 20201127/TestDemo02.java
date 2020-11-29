package test20201127;

public class TestDemo02 {
    //最长公共子串
    public static String LCS (String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        //以str1为操作对象
        while (end < str1.length()+1) {
            if (str2.contains(str1.substring(start,end))) {
                if (end -start > sb.length()){
//                    sb = new StringBuilder();//全部删除了  这两个是一样的效果
                    sb.delete(0,sb.length());//全部删除了
                    sb.append(str1,start,end);
                }

            }else{
                //这个算法我曾经疑惑，假如出现start>end，程序不是会crash么
                //通过debug发现，当start==end时，substring获取的是""，此时contains必然为true
                //所以当start == end时，必然会走end++分支
                start++;
            }
            end++;
        }
        if (sb.length() == 0) {
            return "-1";
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "1AB2345CD";
        String str2 = "12345EF";
        System.out.println(LCS(str1,str2));//"2345"

    }
}
