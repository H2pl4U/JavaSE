package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOFileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java\\FileDemo\\file1.txt");
		// 创建一个字节输入流对象,必须明确数据源，其实就是创建字节读取流和数据源相关联。
		FileInputStream fis = new FileInputStream(f);
		//创建一个字节数组。
		byte[] a = new byte[1024];		//长度可以定义成1024的整数倍。
		int len=0;
		while((len=fis.read(a))!=-1){
			System.out.println(new String(a,0,len));
		}
		fis.close();
	}

}
