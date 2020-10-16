package Test20201016;
//检查整型数组是否有序(升序）
public class TestDemo03 {
    public static void main(String[] args) {
        int[] a = {1,2,8,4,5};
        System.out.println(check(a));
    }
    public static boolean check(int[] a){
        for (int i =0; i <a.length-1 ; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
}
