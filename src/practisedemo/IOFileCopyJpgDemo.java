package practisedemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileCopyJpgDemo {
	/*
	 * 需求：将d:\\Java\\FileDemo\\Irving.jpg文件进行复制
	 * 		采用4种方式复制
	 * 		方式1： 采用基本的流，一次一个字节的方式复制	共耗时     96毫秒
	 * 		方式2： 采用基本的流，一个多个字节的方式赋值	共耗时     6毫秒
	 * 		方式3： 采用高效的流，一次一个字节的方式复制	共耗时     9毫秒
	 * 		方式4： 采用高效的流，一个多个字节的方式赋值	共耗时      5毫秒
	 * 
	 * 数据源： d:\\Java\\FileDemo\\Irving.jpg
	 * 目的地1: d:\\Java\\FileDemo\\copy1.jpg
	 * 目的地2: d:\\Java\\FileDemo\\copy2.jpg
	 * 目的地3: d:\\Java\\FileDemo\\copy3.jpg
	 * 目的地4: d:\\Java\\FileDemo\\copy4.jpg
	 * 
	 * 实现的步骤：
	 * 	1，指定数据源
	 * 	2，指定目的地
	 * 	3，读数据
	 * 	4，写数据
	 * 	5，关闭流
	 * 
	 */
	public static void main(String[] args) throws IOException {
		//计时开始
		long start = System.currentTimeMillis();
		//方式1： 采用基本的流，一次一个字节的方式复制
		method1("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy1.jpg");
		//方式2： 采用基本的流，一个多个字节的方式赋值
		method2("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy2.jpg");
		//方式3： 采用高效的流，一次一个字节的方式复制
		method3("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy3.jpg");
		//方式4： 采用高效的流，一个多个字节的方式赋值
		method4("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy4.jpg");
		//计时结束
		long end = System.currentTimeMillis();
		//统计各个流的复制耗时
		System.out.println("这种方法耗时为"+(end-start));
	}

	private static void method4(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(src)));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest)));
		byte[] buf = new byte[1024];
		int len=0;
		while((len=bis.read(buf))!=-1){
			bos.write(buf, 0, len);
		}
		bis.close();
		bos.flush();
		bos.close();
	}

	private static void method3(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(src)));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest)));
		int ch=0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		bis.close();
		bos.flush();
		bos.close();
	}

	private static void method2(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(new File(src));
		FileOutputStream fos = new FileOutputStream(new File(dest));
		byte[] buf = new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		fis.close();
		fos.flush();
		fos.close();
		
	}

	private static void method1(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(new File(src));
		FileOutputStream fos = new FileOutputStream(new File(dest));
		int ch = 0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fis.close();
		fos.close();
		
	}

}
