/**
 * @Classname Example
 * @Description
 * @Date 2022/5/19 19:25
 * @Created by Andy
 */
public class Example {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("分割线");

        for (int i = 1; i <= 9; i++) {
            //String line = "";
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    break;
                }
                //line += i + "*" + j + "=" + i * j + "\t";
                line.append(i).append("*").append(j).append("=").append(i * j).append("\t");
            }
            System.out.println(line);
        }
    }
}
