package test20201113;

import java.util.Objects;

class Card implements Comparable<Card>{
    public int rank;//数值
    public String suit;//花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        //引用同一个对象
        if (this == o) return true;
        //o为空或者 o不是Card的实例
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

    /**
     * 返回值等于0   相等
     * 大于0
     * 小于0
     * @param o
     * @return
     */
    @Override
    public int compareTo(Card o) {
        return this.rank - o.rank;
    }
}
public class TestDemo01 {
    public static void main(String[] args) {
        Card card1 = new Card(6,"♥");
        Card card2 = new Card(6,"♥");
//        System.out.println(card1 == card2);
        System.out.println(card1.compareTo(card2));
//        System.out.println(card1.equals(card2));
/*
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));*/
    }
}
