package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOCharStreamCNFileReaderDemo {

	public static void main(String[] args) throws IOException {
		writeCNtext();
		readCNtext();
	}

	private static void readCNtext() throws IOException {
		FileReader fr = new FileReader("D:\\Java\\FileDemo\\cn.txt");
		int ch=0;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
	}

	private static void writeCNtext() throws IOException {
		File f = new File("D:\\Java\\FileDemo\\cn.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		fos.write("\rƒÍ–Ω100ÕÚ!".getBytes());
		fos.close();
		
	}

}
