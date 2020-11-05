package test20201102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo01 {
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(91);
        list.add(81);
        list.add(61);
        System.out.println(list);
        Collections.sort(list);//这里默认是升序排序的
        System.out.println(list);
    }
    public static void main(String[] args) {
        Student student1 = new Student("小明","九一班",88.8);
        Student student2 = new Student("小率","九7班",77.8);
        Student student3 = new Student("小hong","九8班",68.7);
        List<Student> list = new ArrayList<>();
//        ArrayList<Student> list = new ArrayList<>();//这两个都是可以的
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        for (Student s:list) {
            System.out.println(s);
        }
    }
}
