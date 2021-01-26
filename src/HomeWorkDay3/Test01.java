package HomeWorkDay3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * <p>
 * 单词记一记:
 * exists 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个文件名：");
        String fileName = s.nextLine();
        File f = new File(fileName);
        if (f.exists()) {
            System.out.println("文件名已存在！请重新输入:");
        } else {
            f.createNewFile();
            System.out.println("文件创建成功！");
            System.out.println(f.getName());
        }
    }
}








