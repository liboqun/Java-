/**
 * @Classname ForceConvert
 * @Description
 * @Date 2022/5/18 15:12
 * @Created by Andy
 */
public class ForceConvert {

    public static void main(String[] args) {

        int intVal;
        long longVal = 1999900000;
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVal;
        double doubleVal = 223456787.88;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);

        int a = 65;
        char b = (char) a;
        System.out.println(b);
    }
}
