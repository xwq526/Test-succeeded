package test20201122;
//705. 设计哈希集合         https://leetcode-cn.com/problems/design-hashset/
public class MyHashMap {
    static class Node {
        public int data;
        public int value;
        public Node next;
        public Node (int data, int value) {
            this.data = data;
            this.value = value;
        }
    }
    public Node[] array;
    public int usedSize;
    /** Initialize your data structure here. */
    public MyHashMap() {
        this.array = new Node[10];
        this.usedSize = 0;
    }
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key % array.length;
        //如果里面已经有相同的key了
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if(cur.data == key) {
                cur.value = value;
                return;
            }
        }
        //里面没有存放这个key
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        usedSize++;
        //这个时候还要考虑负载因子，看是否需要扩容
        if (loadFactor() > 0.75) {
            resize();
        }
    }
    //计算负载因子
    public double loadFactor() {
        return usedSize*1.0 / array.length;
    }
    //扩容  （注意这里需要重新哈希一下了）
    public void resize() {
        Node[] newArray = new Node[array.length*2];
        for(int i = 0; i < array.length; i++) {
            Node curNext = null;
            for(Node cur = array[i];cur != null; cur = curNext) {
                curNext = cur.next;
                int index = cur.data % newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        this.array = newArray;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = key % this.array.length;
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.data == key) {
                return cur.value;
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = key % this.array.length;
        Node curNext = null;
        Node prev = null;
        for (Node cur = array[index]; cur != null; cur = curNext) {
            curNext = cur.next;
            if (cur.data == key) {
                if (cur == array[index]) {//头节点
                    array[index] = curNext;
                }else {
                    prev.next = curNext;
                }
                return;
            }
            prev = cur;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

