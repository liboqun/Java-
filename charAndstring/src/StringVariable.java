/**
 * @Classname StringVariable
 * @Description
 * @Date 2022/5/18 16:03
 * @Created by Andy
 */
public class StringVariable {
    public static void main(String[] args) {

        int a = 10;
        String str = "a的值是";
        str = str + a;
        System.out.println(str);

        String s2 = "a的值是";
        System.out.println(s2 + a);
        System.out.println(s2);
    }
}
