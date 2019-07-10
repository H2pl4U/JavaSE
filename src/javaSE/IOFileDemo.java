package javaSE;

import java.io.File;

import java.io.IOException;

public class IOFileDemo {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * public boolean createNewFile()创建文件
		返回值为true， 说明创建文件成功
		返回值为false，说明文件已存在，创建文件失败
			public boolean mkdir() 创建单层文件夹
		创建文件夹成功，返回 true
		创建文件夹失败，返回 false
			public boolean mkdirs() 创建多层文件夹
			public boolean delete()
		删除此抽象路径名表示的文件或目录。
		如果此路径名表示一个目录，则该目录必须为空才能删除
			public boolean isDirectory() 判断是否为文件夹
			public boolean isFile() 判断是否为文件
			public boolean exists() 判断File对象对应的文件或文件夹是否存在
			public String getAbsolutePath() 获取当前File的绝对路径
			public String getName() 获取当前File对象的文件或文件夹名称
		    public long length() 获取当前File对象的文件或文件夹的大小（字节）
			public File[] listFiles() 获取File所代表目录中所有文件或文件夹的绝对路径
		 */
		
		File f1 = new File("D:\\Java\\FileDemo\\fileDemo.java");
		System.out.println(f1);
		//									parent                        child
		File f2 = new File("D:\\Java\\FileDemo","fileDemo02.java");
		System.out.println(f2);
		
		//将parent封装成file对象
		File p = new File("D:\\Java\\FileDemo");
		File f3 = new File(p,"fileDemo03.java");
		System.out.println(f3);
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getPath());
		System.out.println(f3.getName());
		System.out.println(f1.length());
		
		//文件操作
		File file = new File("D:\\Java\\FileDemo","file.txt");
		//createNewFile()  创建文件，如果文件不存在，创建 true 如果文件存在，则不创建 false。 如果路径错误，IOException。
		System.out.println(file.createNewFile());
		
		//delete()    删除文件操作-------注意：不去回收站。慎用!
		System.out.println(file.delete());
		
		//exists() 判断文件是否存在
		System.out.println(file.exists());
		
		//目录(文件夹)操作
		File dir = new File("D:\\Java\\FileDemo\\folder");
		//mkdir()创建单个目录。
		System.out.println(dir.mkdir());
		//dir.mkdirs();创建多级目录
		
		//删除目录时，如果目录中有内容，无法直接删除。
		System.out.println(dir.delete());
		
		//判断是否存在
		System.out.println(file.isFile());
		
		
		
		
	}

}
