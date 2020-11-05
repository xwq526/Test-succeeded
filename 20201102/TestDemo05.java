package test20201102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("数学");
        list.add("语文");
        list.add("英语");




        List<String> courses = new ArrayList<>();
        courses.add("c语言");
        courses.add("java SE");
        courses.add("java web");
        courses.add("java EE");
        //和数组一样可以添加重复元素
        courses.add("c语言");
        courses.add(1,"数据结构");
        //按照添加的顺序打印
        System.out.println(courses);
        System.out.println(courses.addAll(list));//boolean addAll(Collection<? extends E> c)
        System.out.println(courses.remove(2));//E remove(int index)
        System.out.println(courses.remove("java EE"));//boolean remove(Object o)
        System.out.println(courses);
        System.out.println(courses.contains("c语言"));
        System.out.println(courses.indexOf("c语言"));
        System.out.println(courses.lastIndexOf("c语言"));
        //截取部分
        List<String> subCourses = courses.subList(1,3);//前闭后开
        System.out.println(subCourses);
        //重新构造
        List<String> courses2 = new ArrayList<>(courses);
        System.out.println(courses2);

        List<String> courses3 = new LinkedList<>(courses);
        System.out.println(courses3);

        //引用的转换
        ArrayList<String> courses4 = (ArrayList<String>)courses2;
        System.out.println(courses4);
// LinkedList<String> c = (LinkedList<String>)course2; 错误的类型
        LinkedList<String> courses5 = (LinkedList<String>)courses3;
        System.out.println(courses5);
// ArrayList<String> c = (ArrayList<String>)course3; 错误的类型







        //类似数组下标的方式访问
//        System.out.println(courses.get(0));
//        System.out.println(courses);
//        courses.set(0,"计算机基础");
//        System.out.println(courses);




    }
}
