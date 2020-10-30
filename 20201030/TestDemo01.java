package test20201030;
import java.util.Scanner;
//实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码. 如果用户名密码出错, 使用自定义异常的方式来处理
class NameException extends RuntimeException {
    public NameException(String message) {
        super(message);
    }
}
class PasswordException extends  RuntimeException {
    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo01{
    public static void main(String[] args) throws NameException,PasswordException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入用户密码：");
        String password = scanner.next();
        login(name,password);
        System.out.println("登录成功");
    }
    public static void login(String name, String password) throws NameException,PasswordException{
        String name1 = "xwq";
        if (!name1.equals(name)) {
            throw new NameException("用户名错误");
        }
        String password1 = "xwq123";
        if (!password1.equals(password)) {
            throw new PasswordException("用户密码错误");
        }
    }
}
