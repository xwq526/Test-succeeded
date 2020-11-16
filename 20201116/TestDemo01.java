package test20201116;

import java.util.HashMap;
import java.util.Map;

//复制链表  力扣
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        //map里面的key是原来的节点，value里面是新new出来的；
        //下面只是new了，并没有给next 和random 节点
        while (cur != null) {
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        //创建关系
        cur = head;
        while (cur != null) {
            //连接next关系
            map.get(cur).next = map.get(cur.next);
            //连接random关系
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}


public class TestDemo01 {
}
