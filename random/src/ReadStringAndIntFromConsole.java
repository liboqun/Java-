import java.util.Scanner;

/**
 * @Classname ReadStringAndIntFromConsole
 * @Description
 * @Date 2022/5/21 12:01
 * @Created by Andy
 */
public class ReadStringAndIntFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请问你的名字是");
        //输入字符串
        String str = in.nextLine();
        System.out.println(str + ",你好.");
        //输入整数
        int age = in.nextInt();
        System.out.println("好的," + str + age + "岁了.");
    }
}
