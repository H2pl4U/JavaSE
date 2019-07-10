package javaSE;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*
 * OutputStreamWriter和InputStreamReader是字符和字节的桥梁：也可以称之为字符转换流。字符转换流原理：字节流+编码表。
	FileWriter和FileReader：作为子类，仅作为操作字符文件的便捷类存在。当操作的字符文件，使用的是默认编码表时可以不用父类，
	而直接用子类就完成操作了，简化了代码。
	InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));//默认字符集。
	InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");//指定GBK字符集。
	FileReader fr = new FileReader("a.txt");
	这三句代码的功能是一样的，其中第三句最为便捷。
	注意：一旦要指定其他编码时，绝对不能用子类，必须使用字符转换流。什么时候用子类呢？
	条件：
	1、操作的是文件。2、使用默认编码。
	总结：
	字节--->字符 ： 看不懂的--->看的懂的。  需要读。输入流。 InputStreamReader
	字符--->字节 ： 看的懂的--->看不懂的。  需要写。输出流。 OutputStreamWriter
 */

public class IOInputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		readCN();
	}

	private static void readCN() throws IOException {
		InputStream in = new FileInputStream("D:\\Java\\FileDemo\\test2.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.println((char)ch);
		}
		
		//文本不可以用字节的方式赋值！！！
		
//		char[] buf = new char[40960];
//		int len=0;
//		while((len=isr.read())!=-1){
//			System.out.println(new String(buf,0,len));
//		}
		isr.close();
		
	}

}
