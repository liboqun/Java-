/**
 * @Classname StringConcat
 * @Description
 * @Date 2022/5/18 15:49
 * @Created by Andy
 */
public class StringConcat {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a + b;
        //String不是Java中的基本类型 不是保留字
        int String = 1;
        System.out.println(String);

        System.out.println("a + b = " + c);
        System.out.println("a > b是" + false + "的");
        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
    }
}
