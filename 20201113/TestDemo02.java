package test20201113;

import java.util.Arrays;

class Student implements Comparable<Student> {
    public String name;
    public double score;
    public int age;

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
public class TestDemo02 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("c",12.5,98);
        students[1] = new Student("a",32.5,88);
        students[2] = new Student("d",82.5,78);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
