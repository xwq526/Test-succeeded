package test20201022;
class Node {
    public int data;
    public Node next;//存储对象引用

    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向哪个节点
    }
}

public class MySingleList {
    public Node head;//作用是，定位头节点的引用

    //头插法
    public void addFirst(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//        }else {
//            node.next = this.head;
//            this.head = node;
//
//        }


        Node node = new Node(data);
        node.next = this.head;//这两行其实也包括了当链表为空的情况
        this.head = node;


//        if (this.head == null){
//            this.head = node;
//        }else{
//            node.next = this.head;
//            this.head = node;
//        }
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;

//
//        Node node = new Node(data);
//        if (this.head == null){
//            this.head = node;
//            return;
//        }
//        Node cur = this.head;
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        cur.next = node;
    }

    //求index-1位置的节点              (index 是从0开始的）
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;


//        int count = 0;
//        Node cur = this.head;
//        while (count < index-1) {
//            cur = cur.next;
//            count++;
//        }
//        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        //首先得判断index的合法性
        if (index < 0 || index > this.size()) {
            System.out.println("位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;//代表没有key的前驱
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //1.考虑头节点
//        if (this.head.data == key) {
//            this.head = this.head.next;
//            return;
//        }
//        // 2.找需要删除节点的前驱
//        Node prev = searchPrevNode(key);
//        if (prev == null){
//            return;
//        }
//        Node del = prev.next;//就是要删除节点的引用
//        prev.next = del.next;
        if (!contains(key)) {
            System.out.println("没有这个关键字");
            return;
        }
        //如果是第一个
        if (head.data == key) {
            this.head = head.next;
            return;
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.next.data == key) {
                Node tmp = cur.next;
                cur.next = cur.next.next;
                tmp.next = null;
                break;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
//        while (contains(key)) {
//            remove(key);
//        }
        //双指针解题思路（这是一种思想方式）
        //cur:代表当前需要删除的节点
        //prev：代表当前要删除节点的前驱
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }


//        Node prev = this.head;
//        Node cur = this.head.next;
//        while (cur != null){
//            if (cur.data == key){
//                prev.next = cur.next;
//            }else {
//                prev = cur;
//            }
//            cur = cur.next;
//        }
//        if (this.head.data == key) {
//            this.head = this.head.next;
//        }
    }

    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //遍历链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        this.head = null;
    }

    /**
     * 自定义打印   从指定的节点开始打印
     *
     * @param newHead
     */
    public void display2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }

    //反转链表
    public Node reverserList() {
        Node newHead = null;
        Node cur = this.head;
        Node prev = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //中间元素，   （快慢指针法）
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //倒数第k个节点   思路：双指针
    public Node findKthToTai(int k) {
        if (k <= 0) {//oj题要注意再判断一下head是不是为null；
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
//                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //    编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        // write code here
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;

        while (cur != null) {
            if (cur.data < x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;

                }
            }
            cur = cur.next;
        }
        /*
        把新的链表串起来
        1、两个段内 可能有一个是空的
           如果as不等于空，ae.next = null;
        2、如果两个段都有数据
           be.next = as;
         */


//        if (bs == null) {
//            return as;
//        }
//        be.next = as;
//        if (ae != null) {
//            ae.next = null;
//        }


        if (bs == null || as == null) {
            return this.head;
        } else {
            ae.next = null;
            be.next = as;
        }
        return bs;
    }

    //    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead;
    }


    //    对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构
//    给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
    public boolean chkPalindrome() {
        if (this.head == null) {
            return false;
        }
        if (this.head.next == null) {
            return true;
        }
        //1、找中间节点
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //此时slow就是中间节点
        //2、进行第二部反转  （反转这个步骤要再详细的理解和使用）
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、开始判断是不是回文了
        //此时slow为最后一个节点，head为头节点
        while (slow != this.head) {
            if (slow.data != this.head.data) {
                return false;
            }
            if (this.head.next == slow) {//偶数情况
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    //    给定一个链表，判断链表中是否有环。
//    如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
//    为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
//    如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
//    如果链表中存在环，则返回 true 。 否则，返回 false 。
//    进阶：
//    你能用 O(1)（即，常量）内存解决此问题吗？
    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next.next;
            if (fast == slow) {
                break;
            }
        }
        if (this.head == null || this.head.next == null) {
            return false;
        }
        return true;
    }


    //    给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    //这题要一定要画图理解（notice）
    public Node detectCycle() {
        if (this.head == null || this.head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//    由于需要两个链表，所以写在TestDemo01，（即紧挨着的下一个java文件）
