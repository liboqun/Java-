/**
 * @Classname RandomNumber
 * @Description
 * @Date 2022/5/21 11:09
 * @Created by Andy
 */
public class RandomNumber {
    public static void main(String[] args) {
        double randomNum = 0;
        //随机输出一个大于0.5的随机数
        while (randomNum < 0.5) {
            //随机生成一个 0-1 范围的double类型的浮点数
            randomNum = Math.random();
            System.out.println(randomNum);
        }
        System.out.println("生成的大于0.5的随机数是" + randomNum);

        //生成一个指定范围的随机数
        int rangeStart = 30;
        int rangeEnd = 90;
        int mod = rangeEnd - rangeStart;
        int bigRandom = (int) (Math.random() * (89 * 10000));
        int numberToGuess = bigRandom % mod + rangeStart;
        System.out.println("mod = " + mod + "\nbigRandom = " + bigRandom + "\nnumberToGuess = " + numberToGuess);

    }
}
