package javaSE;

import java.io.FileWriter;
import java.io.IOException;

public class IOCharStreamCNFileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Java\\FileDemo\\cn1.txt");
		fw.write("������Ϊ");
		fw.flush();
		fw.close();
	}

}
