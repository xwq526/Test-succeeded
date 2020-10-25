package test20201025;
public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//        doubleLinkedList.addFirst(1);
//        doubleLinkedList.addFirst(2);
        doubleLinkedList.addLast(11);
        doubleLinkedList.addLast(11);
        doubleLinkedList.addLast(11);
        doubleLinkedList.addLast(11);
//        doubleLinkedList.addIndex(3,11);
        doubleLinkedList.display();
        doubleLinkedList.removeAllKey(11);
//        doubleLinkedList.addFirst(3);
//        doubleLinkedList.addFirst(4);
//        doubleLinkedList.addFirst(5);
        doubleLinkedList.display();
        int ret = doubleLinkedList.size();
        System.out.println(ret);
//        doubleLinkedList.clear();
//        System.out.println("jfkldsafkdlaf");
//        doubleLinkedList.display();
//        int ret1 = doubleLinkedList.size();
//        System.out.println(ret1);
    }
}
