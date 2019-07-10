package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileOutputStreamDemo02 {

	public static void main(String[] args) throws IOException{
		File file = new File("D:\\Java\\FileDemo\\file.txt");
		//给文件中续写数据和换行
		FileOutputStream fos = new FileOutputStream(file,true);
		byte[] a ="efg\r\n\t123".getBytes();
		fos.write(a);
		fos.close();
	}

}
