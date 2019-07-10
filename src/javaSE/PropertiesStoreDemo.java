package javaSE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties���ϵ����з���store
 * store(OutputStream out)
 * store(Writer w)
 * �������е��ֽڻ����ַ��������,�������еļ�ֵ��,д���ļ��б���
 */
public class PropertiesStoreDemo {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//����ԭ�ļ���pro����д���ļ���
		FileWriter fw = new FileWriter(new File("D:\\Java\\FileDemo\\pro01.properties"));
		pro.setProperty("name", "lw");
		pro.setProperty("age", "20");
		pro.setProperty("hobby", "coding");
		pro.setProperty("dream", "coder");
		System.out.println(pro);
		pro.store(fw, null);
		fw.close();
		
	}

}
