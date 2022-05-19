/**
 * @Classname IncreaseDecrease
 * @Description
 * @Date 2022/5/19 9:58
 * @Created by Andy
 */
public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        int b = 10;
        System.out.println("b-- = " + b--);
        System.out.println("b = " + b);

        b = 10;
        System.out.println("--b = " + --b);
        System.out.println("b = " + b);

    }
}
