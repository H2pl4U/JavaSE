package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//逐行读文本内容
public class IOReadFileContentTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\\\Java\\\\FileDemo\\\\cn1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		// 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
	    // 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
	    // 因此只要一个 close() 调用即可
		br.close();
	}

}
