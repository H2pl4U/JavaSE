package javaSE;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

class MyFileFilter1 implements FileFilter{
	public boolean accept(File pathname){
		return pathname.isDirectory();
	}
}
public class IOFileFilterDemo {

	public static void main(String[] args) {
		//��ȡ��չ��Ϊ.java�����ļ�
		File f1 = new File("D:\\Java\\JavaSE\\day22_source");
		//��ȡָ��Ŀ¼�µ��ļ���
		File[] files = f1.listFiles(new MyFileFilter1());
		for (File file : files) {
			System.out.println(file);
		}
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("jjf");
		arr.add("jrf");
		arr.add("jbf");
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println(arr);
	}

}
