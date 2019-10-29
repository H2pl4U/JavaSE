package javaSE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 采用高效的字符缓冲流，完成文本文件的赋值
 * 数据源： file.txt
 * 目的地： copyFile.txt
 * 
 * 分析：
 * 	1，指定数据源， 是数据源中读数据，采用输入流
 * 	2,指定目的地，是把数据写入目的地，采用输出流
 * 	3,读数据
 * 	4，写数据
 * 	5，关闭流
 */

public class IOBufferedW_RDemo02 {

	public static void main(String[] args) throws IOException {
		//1，指定数据源， 是数据源中读数据，采用输入流
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\FileDemo\\cn1.txt"));
		//2,指定目的地，是把数据写入目的地，采用输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\Java\\FileDemo\\cnBWCopy.txt")));
		
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
