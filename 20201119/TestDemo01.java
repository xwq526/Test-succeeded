package test20201119;

class HashBuck {
    static class Node {
        public int data;//key   map.put(key,value)
        public int value;
        public Node next;
        public Node (int data, int value) {
            this.data = data;
            this.value = value;
        }
    }
    public Node[] array;
    public int usedSize;
    public HashBuck () {
        this.array = new Node[10];
        this.usedSize = 0;
    }
    public void put(int key, int value) {
        //找位置
        int index = key % this.array.length;
        //遍历这个位置的链表
        for(Node cur = array[index]; cur != null; cur = cur.next) {
            //找到了key一样的，就更新一下value;
            if (cur.data == key) {
                cur.value = value;
                return;
            }
        }
        //在该链表当中没有和当前key值一样的元素，这里我们模拟的就是头插法。这是jdk1.7的，现在jdk1.8是用的尾插法
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        usedSize++;
        //如果负载因子大于0.75那么就需要扩容
        if (loadFactor() > 0.75) {
            resize();
        }

    }
    //计算负载因子
    public float loadFactor() {
        return this.usedSize*1.0f / this.array.length;
    }
    //扩容   必须要重新哈希
    public void   resize() {
        Node[] newArray = new Node[this.array.length*2];
        for (int i = 0; i < this.array.length; i++) {
            Node curNext = null;
            for (Node cur = array[i]; cur != null; cur = curNext) {
                curNext = cur.next;//这里是要注意链表里面有多个元素的时候要保留指向.这个curNext就解决了

                //还是头插法插入
                int index = cur.data % newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        this.array = newArray;
    }
    //得到value
    public int getValue (int key) {
        int index = key % this.array.length;
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.data == key) {
                return cur.value;
            }
        }
        return -1;
    }
}
public class TestDemo01 {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        hashBuck.put(1,1);
        hashBuck.put(21,2);
        hashBuck.put(31,3);
        hashBuck.put(4,4);
        hashBuck.put(5,5);
        hashBuck.put(6,6);
        hashBuck.put(7,7);
//        hashBuck.put(8,8);
        System.out.println("dkafkldfa");
        System.out.println(hashBuck.getValue(21));
    }
}
