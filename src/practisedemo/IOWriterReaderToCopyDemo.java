package practisedemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOWriterReaderToCopyDemo {

	public static void main(String[] args) throws IOException {
		copyTxtfile();
	}

	private static void copyTxtfile() throws IOException {
		FileReader fr = new FileReader("D:\\Java\\FileDemo\\cn.txt");
		FileWriter fw = new FileWriter("D:\\Java\\FileDemo\\cncopy.txt");
		char[] buf = new char[1024];
		int len=0;
		while((len=fr.read(buf))!=-1){
			fw.write(buf, 0, len);;
		}
		
		//循环读写操作。效率低。
//		int ch =0;
//		while((ch=fr.read())!=-1){
//			fw.write(ch);
//		}
		fr.close();
		fw.flush();
		fw.close();
	}

}
