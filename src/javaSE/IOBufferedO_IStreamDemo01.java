package javaSE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBufferedO_IStreamDemo01 {

	public static void main(String[] args) throws IOException {
		writeOuttxt();
		readIntxt();
		
	}

	private static void readIntxt() throws IOException {
		//创建缓冲流对象
		FileInputStream fis = new FileInputStream("D:\\Java\\FileDemo\\test3.txt");
		//把基本的流包装成高效的流
		BufferedInputStream bis = new BufferedInputStream(fis);
		int ch = 0;
		while((ch=bis.read())!=-1){
			System.out.println((char)ch);
		}
		bis.close();
	}

	private static void writeOuttxt() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo\\test3.txt");
		//使用高效的流，把基本的流进行封装，实现速度的提升
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("abcd".getBytes());
		bos.close();
	}

}
