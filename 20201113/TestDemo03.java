package test20201113;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    public String name;
    public int age;
    public int score;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
public class TestDemo03 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("c",12,98);
        people[1] = new Person("a",32,88);
        people[2] = new Person("d",82,78);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.score - o2.score;
            }
        });
        System.out.println(Arrays.toString(people));

    }
}
