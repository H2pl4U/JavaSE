package javaSE;

import java.io.File;
import java.io.FilenameFilter;

class MyFileFilter implements FilenameFilter{
	public boolean accept(File dir,String name){
		return name.endsWith(".JPG");
	}
	
}
public class IOFilenameFilterDemo {

	public static void main(String[] args) {
		File dir = new File("D:\\Java\\JavaSE\\day22_source");
		File[] files = dir.listFiles(new MyFileFilter());
		for (File file : files) {
			System.out.println(file);
		}

	}

}
