package test20201030;
/*题目描述
        将给出的链表中的节点每 k 个一组翻转，返回翻转后的链表
        如果链表中的节点数不是k 的倍数，将最后剩下的节点保持原样
        你不能更改节点中的值，只能更改节点本身。
        要求空间复杂度  O(1)
        例如：
        给定的链表是1→2→3→4→5
        对于 k=2, 你应该返回 2→1→4→3→5
        对于  k=3, 你应该返回 3→2→1→4→5*/
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int i) {
    }
}
public class TestDemo02 {
    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        if(head==null||head.next==null||k==1) return head;
        ListNode res = new ListNode(0);
        res.next = head;
        int length = 0;
        ListNode pre = res,
                cur = head,
                temp = null;
        while(head!=null){
            length++;
            head = head.next;
        }
        //分段使用头插法将链表反序
        for(int i=0; i<length/k; i++){
            //pre作为每一小段链表的头节点，负责衔接
            for(int j=1; j<k; j++){
                temp = cur.next;
                cur.next = temp.next;
                //相当于头插法，注意：
                //temp.next = cur是错误的，temp需要连接的不是前一节点，而是子序列的头节点
                temp.next = pre.next;
                pre.next = temp;
            }
            //每个子序列反序完成后，pre，cur需要更新至下一子序列的头部
            pre = cur;
            cur = cur.next;
        }
        return res.next;
    }
}
/*
import java.util.*;

*/
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 *//*


public class Solution {
    */
/**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     *//*

    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if (head == null || head.next == null || k == 1) return head;
        int t = k - 1;
        ListNode p0 = null, p1 = head, p2 = head;
        while (p2 != null) {
            if (t != 0) {
                p2 = p2.next;
                t--;
            }
            if (t == 0 && p2 != null) {
                reverse(p1, p2);

                if (p0 == null) {
                    head = p2;
                } else {
                    p0.next = p2;
                }
                p0 = p1;
                p1 = p1.next;
                p2 = p1;
                t = k - 1;
            }
        }
        return head;
    }
    public void reverse(ListNode head, ListNode tail) {
        ListNode p1 = head, p2 = head.next, p = head, last = tail.next;
        while (p2 != last && p2 != null) {
            p1.next = p2.next;
            p2.next = p;
            p = p2;
            p2 = p1.next;
        }
    }
}*/
