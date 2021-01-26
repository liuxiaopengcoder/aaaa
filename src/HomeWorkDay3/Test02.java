package HomeWorkDay3;

import java.io.File;
import java.io.FileFilter;
/**
 * 列出当前目录中所有名字包含s的子项。
 * 
 * 使用匿名内部类和lambda两种写法
 * 
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 * 
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File f = new File("./");
		FileFilter filter = (file)->file.getName().contains("s");
		File[] files = f.listFiles(filter);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}
}
