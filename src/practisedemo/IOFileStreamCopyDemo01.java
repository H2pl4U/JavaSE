package practisedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStreamCopyDemo01 {

	public static void main(String[] args) throws IOException {
		/*
		 * 输入流和输出流之间是通过ch这个变量进行数据交换的。
			上述复制文件有个问题，每次都从源文件读取一个，然后在写到指定文件，
			接着再读取一个字符，然后再写一个，一直这样下去。效率极低。
		 */
		//1,明确源和目的。
		File f1 = new File("D:\\Java\\FileDemo\\Irving.jpg");
		File f2 = new File("D:\\Java\\FileDemo\\Irvingcopy.jpg");
		//2,明确字节流 输入流和源相关联，输出流和目的关联。
		FileOutputStream fos =new FileOutputStream(f2);
		FileInputStream fis = new FileInputStream(f1);
		//3, 使用输入流的读取方法读取字节，并将字节写入到目的中。
		int ch=0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fos.close();
		fis.close();
	}

}
