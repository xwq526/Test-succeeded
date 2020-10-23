package test20201023;

public class TestDemo01 {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(4);
        doubleList.addLast(4);
        doubleList.addLast(4);
        doubleList.addLast(4);
//        doubleList.addIndex(0,99);
//        doubleList.addFirst(88);
        doubleList.display();
        doubleList.removeAllKey(4);
        doubleList.display();
    }
}
