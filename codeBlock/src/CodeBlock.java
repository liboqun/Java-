/**
 * @Classname CodeBlock
 * @Description
 * @Date 2022/5/19 19:14
 * @Created by Andy
 */
public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;
        {
            int inner = 10;
            System.out.println("outer变量的值是" + outer + ".inner变量的值是" + inner);
        }
        //代码块外部无法使用代码块内部的变量
        //System.out.println(inner);
        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
                System.out.println("a3 = " + a3);
            }
            {
                int a3 = a2 + 10;
                System.out.println("a3 = " + a3);
            }
            System.out.println(a2);
        }
    }
}
