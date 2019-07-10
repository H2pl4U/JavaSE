package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileExceptionDemo {

	public static void main(String[] args) {
		File f = new File("D:\\Java\\FileDemo\\file1.txt");
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream(f);
			byte[] a = "abcde".getBytes();
			fos.write(a);
		}catch(IOException e){
			e.setStackTrace(null);
		}finally{
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					throw new RuntimeException("");
				}
			}
		}
	}

}
