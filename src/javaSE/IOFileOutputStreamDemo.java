package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Java\\FileDemo\\file.txt");
		//������д���ļ�
		FileOutputStream fos = new FileOutputStream(file);
		byte[] a = "abcd".getBytes();
		fos.write(a);
		fos.close();
		
		
	}

}
