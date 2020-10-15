package Test20201014;
//递归求解汉诺塔问题
public class TestDemo08 {
    public static void main(String[] args) {
        hanoiTower(3,'A','B','C');
    }
    public static void move(char x,char y){
        System.out.print(x+"->"+y+"\t");
    }
    /**
     *
     * @param n 盘子的数量
     * @param a 盘子的现在位置
     * @param b 中转的位置
     * @param c 终点位置
     */
    public static  void hanoiTower(int n, char a,char b,char c){
        if (n == 1) {
            move(a,c);
            return;
        }
        hanoiTower(n-1,a,c,b);
        move(a,c);
        hanoiTower(n-1,b,a,c);
    }
}
