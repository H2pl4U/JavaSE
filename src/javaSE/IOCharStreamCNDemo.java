package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCharStreamCNDemo {

	public static void main(String[] args) throws IOException {
		writeCNtext();
		readCNtext();
	}

	private static void readCNtext() throws IOException {
		File f = new File("D:\\Java\\FileDemo\\cn.txt");
		FileInputStream fis = new FileInputStream(f);
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.println(ch);
			//读取含有中文的文件时，我们并没有看到具体的中文，
			//而是看到一些数字,就算用强制转换为char类型也仅仅将中文转换成了？
			System.out.println((char)ch);
		}
		fis.close();
	}

	private static void writeCNtext() throws IOException {
		File f = new File("D:\\Java\\FileDemo\\cn.txt");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write("我要成为架构师!".getBytes());
		fos.close();
		
	}

}
