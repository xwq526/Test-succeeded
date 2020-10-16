package Test20201015;
// 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
public class TestDemo03 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,1,1};
        int [] b = null;
        int [] c = {};
        System.out.println(sum(a));
        System.out.println(sum(b));
        System.out.println(sum(c));
    }
    public static int sum(int[] a){
        if(a==null){//防止NullPointerException
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        return  sum;
    }
}
