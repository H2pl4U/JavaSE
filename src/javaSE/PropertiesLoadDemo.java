package javaSE;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
	/*
	* A: Properties���ϵķ���load
	* a: ��������
	* Properties�������з��� load
	* load(InputStream in)
	* load(Reader r)
	* ����������ֽڻ����ַ�������
	* �������ȡ�ļ��еļ�ֵ��,���浽����
	*/

public class PropertiesLoadDemo {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		FileReader fr =new FileReader(new File("D:\\Java\\FileDemo\\jdbc.properties"));
		pro.load(fr);
		System.out.println(pro.getProperty("password"));
		fr.close();
		System.out.println(pro);
	}

}
