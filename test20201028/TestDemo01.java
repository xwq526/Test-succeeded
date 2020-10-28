package test20201028;
//反转和设置k反转//牛客和力扣有题可以练习
public class TestDemo01 {
    public static String swap(String str , int i,int j) {
        if (str == null) {
            return null;
        }
        char[] array= str.toCharArray();
        while (i<j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        return new String(array);
    }
    public static String reverse2K(String str ,int k) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        if( len == 0 || k <= 0 || k > str.length()) {
           return null;
        }
        str = swap(str,0,k-1);
//        System.out.println(str);
        str = swap(str,k,len - 1);
//        System.out.println(str);
        str = swap(str,0,len -1);
//        System.out.println(str);
        //bacdef
        //bafedc
        //cdefab
        return str;
    }



    public static String reverse1(String str) {
        if (str == null) {
            return null;
        }
        //1、先把字符串转变为数组
        char[] array= str.toCharArray();
        //2、开始逆置
        int i = 0;
        int j = array.length-1;
        while (i<j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        //3、把数组变成字符串
        return new String(array);
//        return String.valueOf(array);
//        return String.copyValueOf(array);
    }

    public static StringBuilder reverse(String str) {
        char[] a = str.toCharArray();
        StringBuilder str1 = new StringBuilder();
        for (int i = a.length-1; i >= 0 ; i--) {
            str1.append(a[i]);
        }
        return str1;
    }
    public static void main1(String[] args) {
//        String str1 = "hello";
//        StringBuilder ret = reverse(str1);
//        String ret1 = reverse1(str1);
//        System.out.println(ret);
//        System.out.println(ret1);


        String str2 = "abcdef";
        String ret2 = reverse2K(str2,2);
        System.out.println(ret2);
    }

    public static void main(String[] args) {
        //字符串的截取     前闭后开
       /* String str = "abcdef";
        String str2 = str.substring(2);
        String str3 = str.substring(2,4);
        System.out.println(str2);
        System.out.println(str3);*/


        //其他方法
        String str = "  hello world   ";
        System.out.println(str.trim());

        String str2 = "HELLO eRtH";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());


        //intern 方法       字符串入池操作
        String str3 = new String("hello").intern();
        System.out.println(str3);












    }
}
