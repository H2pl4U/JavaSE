package practisedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStreamCopyDemo02 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\Java\\FileDemo\\Irving.jpg");
		File f2 = new File("D:\\Java\\FileDemo\\Irvingcopy2.jpg");
		// 明确字节流 输入流和源相关联，输出流和目的关联。
		FileOutputStream fos =new FileOutputStream(f2);
		FileInputStream fis = new FileInputStream(f1);
		//定义一个缓冲区。
		byte[] a = new byte[1024];
		int len=0;
		while((len=fis.read(a))!=-1){
			fos.write(a,0,len);		// 将数组中的指定长度的数据写入到输出流中。
		}
		fos.close();
		fis.close();
	}

}
