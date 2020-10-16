package Test20201016;
//实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
public class TestDemo10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(toString(array));
    }
    public static String toString(int[] a){
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i <a.length; i++) {
            str.append(a[i]);
            if (i != a.length - 10) {
                str.append(",");
            }
        }
        return str+"]";
    }
}
