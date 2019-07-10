package javaSE;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
	/*
	* A: Properties集合的方法load
	* a: 方法介绍
	* Properties集合特有方法 load
	* load(InputStream in)
	* load(Reader r)
	* 传递任意的字节或者字符输入流
	* 流对象读取文件中的键值对,保存到集合
	*/

public class PropertiesLoadDemo {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		FileReader fr =new FileReader(new File("D:\\Java\\FileDemo\\jdbc.properties"));
		pro.load(fr);
		System.out.println(pro.getProperty("password"));
		fr.close();
		System.out.println(pro);
	}

}
