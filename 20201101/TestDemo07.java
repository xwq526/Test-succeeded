package test20201101;
//l0->ln->l1->ln-1
//重新排序

import java.util.*;
public class TestDemo07 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode start = head;
        ListNode end = slow.next;
        mid.next = null;//断链
        //反转后面这段
        ListNode prev = null;
        ListNode cur = end;
        while ( cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        end = prev;
        //开始连接
        //就是插入
        while (start != null && end != null) {
            ListNode next1 = start.next;
            ListNode next2 = end.next;
            start.next = end;
            end.next = next1;
            start = next1;
            end = next2;
        }
        return;
    }
}