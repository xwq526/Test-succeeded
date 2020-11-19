package test20201119.hashbuck;

import java.util.Objects;

class Person {
    public int id;
    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


class HashBuck<K,V> {
    static class Node<K,V> {
        public K data;
        public V value;
        public Node next;
        public Node(K data,V value) {
            this.data = data;
            this.value = value;
        }
    }
    public Node[] array;
    public int usedSize;
    public HashBuck() {
        this.array = new Node[10];
        this.usedSize = 0;
    }

    /**
     * Object:   hashcode    equals
     * 为什么要重写？   1.hashcode   找位置   2. equals  比较key是否相同
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        int hash = key.hashCode();//找位置
        int index = hash % this.array.length;//合法的下标
        for (Node<K,V> cur = array[index]; cur != null; cur = cur.next) {
            if (cur.data.equals(key)) {
                cur.value = value;
            }
        }
        //头插法
        Node<K,V> node = new Node<K,V>(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
    }
    public V getValue(K key) {
        int hash = key.hashCode();
        int index = hash % array.length;
        for (Node<K,V> cur = array[index]; cur != null; cur = cur.next) {
            if (cur.data.equals(key)) {
                return cur.value;
            }
        }
        return null;
    }
}


public class TestDemo01 {
    public static void main(String[] args) {
        Person person1 = new Person(6122);
        Person person2 = new Person(6122);
        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        HashBuck<Person,String> hashBuck = new HashBuck<>();
        hashBuck.put(person1,"徐文青");
        System.out.println(hashBuck.getValue(person2));

    }
}
