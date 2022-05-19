/**
 * @Classname SimpleFor
 * @Description
 * @Date 2022/5/19 12:08
 * @Created by Andy
 */
public class SimpleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i的值是:" + i);
        }
        char ch = '我';
        for (int i = 0; i < 26; i++) {
            System.out.println((int) ch + i + "\t" + (char) ((int) ch + i));
        }
        int dividend = 100;
        int divisor = 3;
        int found = 0;
        for (int i = 0; i < 100 && found < 10; i++) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + ",商为" + (dividend / divisor));
                found++;
            }
            dividend--;

        }
    }
}
