package javaSE;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class IOOutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo\\test2.txt");
		//�������ñ���Ϊutf-8
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		osw.write("���jjh��");
		System.out.println(osw.getEncoding());
		osw.flush();
		osw.close();
		
	}

}
