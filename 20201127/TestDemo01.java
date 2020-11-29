package test20201127;
//两个链表生成相加链表     https://www.nowcoder.com/practice/c56f6c70fb3f4849bc56e33ff2a50b6b?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking
/*假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
        给定两个这种链表，请生成代表两个整数相加值的结果链表。
        例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。*/
class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo01 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        head1 = reverse(head1);
        head2 = reverse(head2);
        //假头
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int count = 0;
        while (head1 != null || head2 != null ||count > 0) {
            int value = count;
            if (head1 != null) {
                value += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                value += head2.val;
                head2 = head2.next;
            }
            int sum = value % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            count = value /10;
        }
        //判断最后是不是要进位
        if(count > 0) {
            cur.next = new ListNode(count);
        }
        //连接起来是反的，再次反转
        return reverse(head.next);


    }
    //反转链表
    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    public static void main(String[] args) {

    }
}
