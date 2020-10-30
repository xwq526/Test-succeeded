package test20201030;
import java.util.*;
//给定一个链表，删除链表的倒数第n个节点并返回链表的头指针

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class TestDemo06 {
    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (n > 0) {
            if (fast == null) {
                return null;//这种情况是n不合法
            }
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            return slow.next;//这种情况删除的是头节点
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //此时的slow就是倒数第n个节点的前驱
        ListNode temp = slow.next;
        slow.next = temp.next;
        return head;
    }
}