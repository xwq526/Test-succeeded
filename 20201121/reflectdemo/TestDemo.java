package test20201121.reflectdemo;
class Student {
    //私有属性name
    private String name = "bit";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student() {
        System.out.println("Student()");
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }
    private void eat() {
        System.out.println("i am eat");
    }
    public void sleep() {
        System.out.println("i am sleep");
    }
    private void function(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 1.getClass();
         */
        Student student = new Student();
        Class<?> c1 = student.getClass();

        /**
         * 2.类名.class
         */
        Class<?> c2 = Student.class;

        /**
         * 全限定  -》 路径
         */
        try {
            Class<?> c3 = Class.forName("test20201121.reflectdemo.Student");
            System.out.println(c1 == c2);
            System.out.println(c1 == c3);
            System.out.println(c3 == c2);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }






     /*   System.out.println(String.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());*/
    }
}
