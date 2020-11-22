package test20201121.enumdemo;

import java.lang.reflect.Constructor;

/**
 *1.我们自己写的枚举类，会默认继承Enum
 *       values：方法为什么不在Enum??????????
 * 2.枚举的构造方法默认都是私有的
 * 3.反射枚举
 */
public enum TestEnum {
    RED("红色",1),BLACK("黑色",2),
    WHITE("白色",3);
    public  String color;
    public int ordinal;

    TestEnum(String color, int ordinal) {
        this.color = color;
        this.ordinal = ordinal;
    }
    public static TestEnum getEnumKey(int key) {
        for (TestEnum t : TestEnum.values()) {
            if (t.ordinal == key) {
                return t;
            }
        }
        return null;
    }
    public static void reflectPeivateConstructor() {
        try {
            Class<?> classTestEnum =
                    Class.forName("test20201121.enumdemo.TestEnum");
            Constructor<?> declaredConstructorTestEnum =
                    classTestEnum.getDeclaredConstructor(String.class, int.class,
                            String.class,int.class);
            declaredConstructorTestEnum.setAccessible(true);
            Object objectTestEnum =
                    declaredConstructorTestEnum.newInstance
                            ("绿色",666,"skdfla",78);
            TestEnum testEnum = (TestEnum) objectTestEnum;
            System.out.println("获得枚举对象：" + testEnum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        reflectPeivateConstructor();
    }

    public static void main2(String[] args) {
        TestEnum[] testEnum = TestEnum.values();
        for (int i = 0; i < testEnum.length; i++) {
            System.out.println(testEnum[i].ordinal);//这个是拿的ordinal的值
            System.out.println(testEnum[i].ordinal());//这个是拿的下标
        }
        System.out.println(TestEnum.valueOf("BLACK"));


      /*
        TestEnum testEnum1 = BLACK;
        TestEnum testEnum2 = RED;
        System.out.println(testEnum2.compareTo(testEnum1));
        //序号
        System.out.println(BLACK.compareTo(testEnum2));*/
    }
    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
           /* case GREEN:
                System.out.println("black");
                break;*/
            default:
                break;
        }
    }
}
