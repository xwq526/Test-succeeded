package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 16:38:05
 */
public class 了解枚举 {
    enum Gender {
        FEMALE,MALE,SECRET;
    }

    public static void main(String[] args) {
        Gender[] values = Gender.values();
        for (Gender gender : values) {
            System.out.println(gender);
        }
    }

}
