package javaSE;

import java.io.File;

public class IOListFilesDemo {

	public static void main(String[] args) {
		/*
		 * 注意：在获取指定目录下的文件或者文件夹时必须满足下面两个条件
		 * 1，指定的目录必须是存在的，
		 * 2，指定的必须是目录。否则容易引发返回数组为null，出现NullPointerException
		 */
		
		File dir = new File("D:\\Java\\JavaSE\\day22_source");
		String[] names = dir.list();
		//获取的是目录下的当前的文件以及文件夹的名称。
		for (String name : names) {
			System.out.println(name);
		}
		
		
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
		
	}

}