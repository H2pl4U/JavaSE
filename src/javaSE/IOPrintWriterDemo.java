package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOPrintWriterDemo {

	public static void main(String[] args) throws IOException {
		function();
		function2();
		function3();
	}
	
	/* 
	 * 打印流,可以开启自动刷新功能
	 * 满足2个条件:
	 *   1. 输出的数据目的必须是流对象
	 *       OutputStream  Writer
	 *   2. 必须调用println,printf,format三个方法中的一个,启用自动刷新
	 */

	private static void function3() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo\\pwdemo4.txt");
		PrintWriter pw= new PrintWriter(fos, true);
		pw.print("i");
		pw.print("love");
		pw.print("java");
		pw.close();
		
	}

	/*
	 * 打印流输出目的是String和流对象
	 * 
	 * 打印流,输出目的,是流对象
	 * 可以是字节输出流,可以是字符的输出流
	 * OutputStream  Writer
	 */

	private static void function() throws IOException {
//		FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\FileDemo\\pwdemo1.txt"));
		FileWriter fw = new FileWriter(new File("D:\\Java\\FileDemo\\pwdemo2.txt"));
		PrintWriter pw = new PrintWriter(fw);
		pw.print("打印流");
		pw.close();;
	}
	/*
	 * 打印流,输出目的,String文件名
	 */
	private static void function2() throws IOException {
		PrintWriter pw = new PrintWriter("D:\\Java\\FileDemo\\pwdemo3.txt");
		pw.print(3.5);
		pw.close();
	}

}
