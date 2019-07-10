package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOFileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java\\FileDemo\\file1.txt");
		//创建一个字节输入流对象,必须明确数据源，其实就是创建字节读取流和数据源相关联。
		FileInputStream fis = new FileInputStream(f);
		int ch;
		//读取数据。使用 read();一次读一个字节。
		while((ch=fis.read())!=-1){
			System.out.println("ch="+(char)ch);
		}
		fis.close();

	}

}
