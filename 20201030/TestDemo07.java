package test20201030;
import java.util.*;

//给定一个链表，请判断该链表是否为回文结构

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
public class TestDemo07 {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        //找中间位置
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //进行反转
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur =curNext;
        }
        //此时的slow刚刚好在尾节点，而且已经反转了一半
        //开始判断的循环
        while (head != slow) {
            if (head.val != slow.val) {
                return false;
            }
            //偶数情况
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}