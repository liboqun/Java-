/**
 * @Classname Example
 * @Description
 * @Date 2022/5/19 19:46
 * @Created by Andy
 */
public class Example {
    public static void main(String[] args) {
        int n = 10;
        int dividend = 100;
        int divisor = 89;
        int found = 0;
        while (found < n) {
            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor + "商为" + dividend / divisor);
            }
            dividend--;
        }
    }

}
