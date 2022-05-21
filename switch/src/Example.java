import java.util.Scanner;

/**
 * @Classname Example
 * @Description
 * @Date 2022/5/21 10:41
 * @Created by Andy
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        String str = n + "对应的中文数字是:";
        //switch语句中的值必须是int类型 switch括号内的值必须是int
        switch (n) {
            case 1:
                str += "壹";
                break;
            case 2:
                str += "贰";
                break;
            case 3:
                str += "弎";
                break;
            case 4:
                str += "肆";
                break;
            case 5:
                str += "伍";
                break;
            case 6:
                str += "陆";
                break;
            case 7:
                str += "柒";
                break;
            case 8:
                str += "捌";
                break;
            case 9:
                str += "玖";
                break;
            default:
                System.out.println("错误的值:" + n + ".值需要大于等于1,小于等于9.");
        }
        System.out.println(str);
    }
}
