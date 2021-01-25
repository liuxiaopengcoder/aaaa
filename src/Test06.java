import java.util.Random;
import java.util.Scanner;

/**
 * 生成一个4位验证码(数字和字母的组合)
 * 然后输出到控制台并提示用户输入该验证码，只要用户输入正确(无论大小写都算)，
 * 就输出:验证码正确，否则输出:验证码错误
 * <p>
 * <p>
 * 验证码如何生成?
 * 思路导向填空:
 * 1:要先确定生成的内容范围(列出所有可以出现的字符):
 * <p>
 * 2:先思考如何生成其中的一个字符呢？
 * 2.1:确定怎么保存这些可以出现的字符:
 * <p>
 * 2.2:怎么能随机抽选一个
 * <p>
 * 3:既然可以生成一个，如何做到生成4个或更多个?
 * <p>
 * 4:怎么在生成这些字符的过程中将他们组成一个字符串?
 * <p>
 * 5:获取到用户输入的字符串后怎么与之比较,要利用到哪些字符串操作?
 *
 * @author Xiloer
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] c = new char[62];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
          //  System.out.println(c[i]);
        }
   /*     char[] c1 = new char[4];
        String str1 = new String();
        for (int i = 0; i < 4; i++) {
            c1[i] = c[new Random().nextInt(62)];
            str1 += String.valueOf(c1[i]);

        }*/
     //   System.out.println("----------");
       // System.out.println(str1);
      //  System.out.println("请输入验证码：");
        boolean b;
        do {
            char[] c1 = new char[4];
            String str1 = new String();
            for (int i = 0; i < 4; i++) {
                c1[i] = c[new Random().nextInt(62)];
                str1 += String.valueOf(c1[i]);

            }
            System.out.println("----------");
            System.out.println(str1);
            System.out.println("请输入验证码：");
            String a = s.next();
            if (!str1.toUpperCase().equals(a.toUpperCase())) {
                System.out.println("验证错误");
                b = false;
            } else {
                System.out.println("验证成功");
                b=true;
            }
        } while (!b);
    }
}






