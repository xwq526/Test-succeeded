package test20201113;

public class TestDemo06 {

    public String name="abc";
    public static void main(String[] args){
        TestDemo06 test=new TestDemo06();
        TestDemo06 testB=new TestDemo06();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    }
    public static void main1(String[] args) {
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));


    }
}
