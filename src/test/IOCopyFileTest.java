package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopyFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("D:\\Java\\FileDemo\\test1.txt");
		FileOutputStream out = new FileOutputStream("D:\\Java\\FileDemo\\testx.txt");
		int cnt = -1;
		byte[] b = new byte[1024];
		while((cnt=in.read(b, 0, b.length))!=-1) {
			out.write(b, 0, cnt);
		}
		in.close();
		out.close();
	}

}
