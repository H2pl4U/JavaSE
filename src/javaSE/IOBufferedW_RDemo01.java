package javaSE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOBufferedW_RDemo01 {

	public static void main(String[] args) throws IOException {
		writeOuttxt();
		readIntxt();
	}

	private static void readIntxt() throws IOException {
		FileReader fw = new FileReader("D:\\Java\\FileDemo\\test4.txt");
		BufferedReader br = new BufferedReader(fw);
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

	private static void writeOuttxt() throws IOException {
		FileWriter fw = new FileWriter("D:\\Java\\FileDemo\\test4.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0;i <5;i++){
			bw.write("ÄãºÃ¼¾¿¡·É");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
