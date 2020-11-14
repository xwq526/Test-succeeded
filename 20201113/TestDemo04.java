package test20201113;

import java.util.Comparator;
import java.util.PriorityQueue;

class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Agecomp implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.age - o1.age;
    }
}
public class TestDemo04 {
    public static void main(String[] args) {
       /* Agecomp agecomp = new Agecomp();
        PriorityQueue<Animal> priorityQueue = new PriorityQueue<>(agecomp);
        priorityQueue.offer(new Animal("huahua",12));
        priorityQueue.offer(new Animal("feifei",52));
        priorityQueue.offer(new Animal("aiaiai",32));
        System.out.println(priorityQueue);*/

        PriorityQueue<Animal> priorityQueue = new PriorityQueue<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o2.age - o1.age;
            }
        });
        priorityQueue.offer(new Animal("huahua",12));
        priorityQueue.offer(new Animal("feifei",52));
        priorityQueue.offer(new Animal("aiaiai",32));
        System.out.println(priorityQueue);
    }
}
