package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOFileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java\\FileDemo\\file1.txt");
		//����һ���ֽ�����������,������ȷ����Դ����ʵ���Ǵ����ֽڶ�ȡ��������Դ�������
		FileInputStream fis = new FileInputStream(f);
		int ch;
		//��ȡ���ݡ�ʹ�� read();һ�ζ�һ���ֽڡ�
		while((ch=fis.read())!=-1){
			System.out.println("ch="+(char)ch);
		}
		fis.close();

	}

}
