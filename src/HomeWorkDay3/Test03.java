package HomeWorkDay3;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
     /*   File f = new File(".");
     RandomAccessFile r1 = new RandomAccessFile(".", "r");
        String name;
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
             name= files[i].getName();

        }
        RandomAccessFile r2 = new RandomAccessFile("", "rw");


        int d;
        while ((d = r1.read()) != -1) {
            r2.write(d);
        }
        r1.close();
        r2.close();*/


        //获取当前目录下的文件
        File f = new File(".");
        if (f.isDirectory()) {
            FileFilter filter = (file) -> file.isFile();
            File[] subs = f.listFiles(filter);
            for (int i = 0; i < subs.length; i++) {
                String filename = subs[i].getName();
                int index = filename.lastIndexOf(".");
                String name = filename.substring(0, index);
                String ext = filename.substring(index);
                String copyFileName = name + "_cp" + ext;
                RandomAccessFile raf = new RandomAccessFile(subs[i], "r");
                RandomAccessFile raf1 = new RandomAccessFile(copyFileName, "rw");
                int d;
                while ((d = raf.read()) != -1) {
                    raf1.write(d);
                }
                raf.close();
                raf1.close();
            }

        }

    }
}


/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 * 这里要将原文件名拆开后想办法拼接_cp.
 */


