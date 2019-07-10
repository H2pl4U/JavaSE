package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCharStreamCNDemo {

	public static void main(String[] args) throws IOException {
		writeCNtext();
		readCNtext();
	}

	private static void readCNtext() throws IOException {
		File f = new File("D:\\Java\\FileDemo\\cn.txt");
		FileInputStream fis = new FileInputStream(f);
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.println(ch);
			//��ȡ�������ĵ��ļ�ʱ�����ǲ�û�п�����������ģ�
			//���ǿ���һЩ����,������ǿ��ת��Ϊchar����Ҳ����������ת�����ˣ�
			System.out.println((char)ch);
		}
		fis.close();
	}

	private static void writeCNtext() throws IOException {
		File f = new File("D:\\Java\\FileDemo\\cn.txt");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write("��Ҫ��Ϊ�ܹ�ʦ!".getBytes());
		fos.close();
		
	}

}
