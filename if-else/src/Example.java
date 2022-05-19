/**
 * @Classname Example
 * @Description
 * @Date 2022/5/19 10:47
 * @Created by Andy
 */
public class Example {
    public static void main(String[] args) {
        // 求三个数中的最大值问题
        int a = 10;
        int b = 99;
        int c = 99;

        if (a == b && b == c) {
            System.out.println("a,b,c等大,大小为" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大的值,为" + a);
                } else {
                    if (a == c) {
                        System.out.println("a和c是最大的值,为" + a);
                    } else {
                        System.out.println("c是最大的值.为" + c);
                    }
                }
            } else {
                if (b > c) {
                    if (a == b) {
                        System.out.println("a和b等大,为" + a);
                    } else {
                        System.out.println("b是最大的值,为" + b);
                    }
                } else {
                    if (b == c) {
                        System.out.println("b和c等大,为" + b);
                    } else {
                        System.out.println("c是最大的值,为" + c);
                    }
                }
            }
        }
    }
}
