package test20201121.reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClassDemo {
    public static void reflectNewInstance() {
        try {
            Class<?> classSudent =
                    Class.forName("test20201121.reflectdemo.Student");
            Object objectStudent =
                    classSudent.newInstance();//这个方法的返回值是泛型，所以要object类型接收
            Student student = (Student) objectStudent;//（强制向下转型）
            System.out.println("获得学生对象：" + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //反射私有构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classStudnet = Class.forName("test20201121.reflectdemo.Student");
            //注意传入的参数
            Constructor<?> declareConstructorStudent =
                    classStudnet.getDeclaredConstructor(String.class,int.class);
            //setAccessible 设置为true后，可修改访问权限
            declareConstructorStudent.setAccessible(true);
            Object objectStudent =
                    declareConstructorStudent.newInstance("小青",22);
            Student student = (Student) objectStudent;
            System.out.println("获得私有构造方法且修改姓名和年龄：" + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> classStudent =
                    Class.forName("test20201121.reflectdemo.Student");
            Field field = classStudent.getDeclaredField("name");
            field.setAccessible(true);
            //可以修改该属性的值
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;

            //field.set(修改的属性的对象的引用，修改的值）；
            field.set(student,"小红");

            //field.get(这个对象的某个属性)
            String name = (String)field.get(student);
            System.out.println("反射私有属性修改了name：" + name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> classStudent =
                    Class.forName("test20201121.reflectdemo.Student");
            Method methodStudent = classStudent.getDeclaredMethod("function", String.class);
            System.out.println("私有方法名为：" + methodStudent.getName());

            //私有的一般都要加
            methodStudent.setAccessible(true);

            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            //通过反射调用方法
            methodStudent.invoke(student,"我是给私有的function函数传的参数");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        reflectPrivateMethod();
    }
}
