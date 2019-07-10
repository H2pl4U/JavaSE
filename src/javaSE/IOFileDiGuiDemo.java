package javaSE;

import java.io.File;

public class IOFileDiGuiDemo {

	public static void main(String[] args) {
		
       /*
        * 构造方法：
				public File(String pathname) 通过给定的文件或文件夹的路径，来创建对应的File对象
				public File(String parent, String child) 通过给定的父文件夹路径，与给定的文件名称或目录名称来创建对应的File对象
				public File(File parent,  String child)通过给定的File对象的目录路径，与给定的文件夹名称或文件名称来创建对应的File对象

			路径的分类：
			绝对路径, 带盘盘符
			 	E:\Workspace\day20_File\abc.txt
			相对路径， 不带盘符
				day20_File\abc.txt
			注意： 当指定一个文件路径的时候，如果采用的是相对路径，默认的目录为 项目的根目录
        */
		File f1 = new File("D:\\qq浏览器\\QQBrowser\\9.7.12900.400\\driver");
		getFileName(f1);
	}

	private static void getFileName(File f1) {
		File[] file = f1.listFiles();
		for (File f : file) {
			if(f.isDirectory()){
				getFileName(f);
			}
			else{
				System.out.println(f);
			}
		}
	}

}
