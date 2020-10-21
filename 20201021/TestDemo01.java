package test20201021;
public class TestDemo01 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
//        mySingleList.addFirst(99);
//        mySingleList.addIndex(5,88);
        mySingleList.display();
//        mySingleList.removeAllKey(2);
//        mySingleList.display();
        Node ret =mySingleList.reverserList();
        mySingleList.display2(ret);
    }
}
