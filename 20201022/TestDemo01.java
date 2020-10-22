package test20201022;
public class TestDemo01 {
//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA != null) {
            tmp.next = headA;
        }else {
            tmp.next = headB;
        }
        return newHead.next;
    }


    public static void main(String[] args) {
        MySingleList mySingleList1 = new MySingleList();
        mySingleList1.addLast(1);
        mySingleList1.addLast(12);
        mySingleList1.addLast(31);
        mySingleList1.addLast(41);


        MySingleList mySingleList2 = new MySingleList();
        mySingleList2.addLast(11);
        mySingleList2.addLast(12);
        mySingleList2.addLast(13);
        mySingleList2.addLast(24);

        Node ret = mergeTwoLists(mySingleList1.head,mySingleList2.head);
        mySingleList1.display2(ret);
    }



    public static void main2(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.addIndex(2,6);
//        mySingleList.addFirst(99);
//        mySingleList.addIndex(5,88);
        mySingleList.display();
//        mySingleList.removeAllKey(2);
//        mySingleList.display();
//        Node ret =mySingleList.reverserList();
//        mySingleList.display2(ret);
    }
}
