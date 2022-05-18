/**
 * @Classname BitCalc
 * @Description
 * @Date 2022/5/17 15:10
 * @Created by Andy
 */
public class BitCalc {
    public static void main(String[] args) {

        //八进制表示前面加0  十六进制加0x
        //二进制转十六进制 二进制每四位对应十六进制的一位

        // 二进制 1111 1000
        int a = 0xF8;

        // 二进制 1111 0100
        int b = 0xF4;

        // 二进制 1111 1111
        int c = 0xFF;


        //按位与 二进制的每一位进行与操作
        System.out.println(a & b); // 1111 0000 240
        //按位或 二进制的每一位进行或操作
        System.out.println(a | b); // 1111 1100 252
        //按位异或 二进制的每一位进行比较 不同取1
        System.out.println(a ^ b); // 0000 1100 12
        //按位取反
        System.out.println(~c); // 
    }
}
