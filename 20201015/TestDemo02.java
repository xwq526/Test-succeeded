package Test20201015;
//作业内容 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class TestDemo02 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,1,1};
        int [] b = null;
        int [] c = {};
        System.out.println(avg(a));
        System.out.println(avg(b));
        System.out.println(avg(c));
    }
    public static double avg(int[] a){
        if(a==null){//NullPointerException
            return 0;
        }
        if(a.length==0){//ArithmeticException
            return 0;
        }
        double sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        double avg = sum/a.length;
        return avg;
    }
}
