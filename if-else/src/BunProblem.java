/**
 * @Classname BunProblem
 * @Description
 * @Date 2022/5/19 10:31
 * @Created by Andy
 */
public class BunProblem {
    public static void main(String[] args) {
        int baozi = 3;
        boolean baoziGangChuLu = true;
        if (baoziGangChuLu) {
            baozi += 2;
            System.out.println("包子刚出笼,买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
        int a = 35;
        int b = 9;
        if (a % b == 0) {
            System.out.println(a + "可以整除" + b + ",商是" + (a / b));
        }
    }
}
