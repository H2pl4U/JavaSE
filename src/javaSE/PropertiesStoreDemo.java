package javaSE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties集合的特有方法store
 * store(OutputStream out)
 * store(Writer w)
 * 接收所有的字节或者字符的输出流,将集合中的键值对,写回文件中保存
 */
public class PropertiesStoreDemo {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//覆盖原文件将pro集合写入文件中
		FileWriter fw = new FileWriter(new File("D:\\Java\\FileDemo\\pro01.properties"));
		pro.setProperty("name", "lw");
		pro.setProperty("age", "20");
		pro.setProperty("hobby", "coding");
		pro.setProperty("dream", "coder");
		System.out.println(pro);
		pro.store(fw, null);
		fw.close();
		
	}

}
