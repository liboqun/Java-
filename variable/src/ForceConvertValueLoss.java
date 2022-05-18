/**
 * @Classname ForceConvertValueLoss
 * @Description
 * @Date 2022/5/18 15:21
 * @Created by Andy
 */
public class ForceConvertValueLoss {
    public static void main(String[] args) {

        int intVal;
        long longVal = 5555555555555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVal;
        double doubleVal = 1234567890.123456;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);
    }
}
