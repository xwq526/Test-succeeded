package test20201106;
//2. 两数相加   力扣     https://leetcode-cn.com/problems/add-two-numbers/


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
//  这题是一种经典题的模板题。要好好研究
class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cur = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0)  cur.next = new ListNode(carry);
        return head.next;
    }
}
public class TestDemo02 {
}
