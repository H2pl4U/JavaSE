package javaSE;

import java.io.File;
import java.io.FilenameFilter;
class MyFileFilter03 implements FilenameFilter{
	public boolean accept(File dir,String name){
		return name.endsWith(".JPG");
	}
}

public class IOFileFindDiGuiDemo {

	public static void main(String[] args) {
		File f1 = new File("D:\\Java\\JavaSE\\day22_source");
		getFindAll(f1);
	}

	private static void getFindAll(File f1) {
		File[] files = f1.listFiles(new MyFileFilter03());
		for (File file : files) {
			if(file.isDirectory()){
				getFindAll(file);
			}
			else{
				System.out.println(file);
			}
		}
		
	}

}
