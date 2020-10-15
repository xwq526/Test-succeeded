package Test20201014;
//返回的数字之和
//作业内容 写一个递归方法，输入一个非负整数，返回组成它的数字之和
public class TestDemo10 {
    public static void main(String[] args) {
        int n=-1;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if (n<=0){
            System.out.println("你的输入不合法！");
            return 0;
        }
        if (n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
}
