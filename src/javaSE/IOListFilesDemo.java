package javaSE;

import java.io.File;

public class IOListFilesDemo {

	public static void main(String[] args) {
		/*
		 * ע�⣺�ڻ�ȡָ��Ŀ¼�µ��ļ������ļ���ʱ��������������������
		 * 1��ָ����Ŀ¼�����Ǵ��ڵģ�
		 * 2��ָ���ı�����Ŀ¼����������������������Ϊnull������NullPointerException
		 */
		
		File dir = new File("D:\\Java\\JavaSE\\day22_source");
		String[] names = dir.list();
		//��ȡ����Ŀ¼�µĵ�ǰ���ļ��Լ��ļ��е����ơ�
		for (String name : names) {
			System.out.println(name);
		}
		
		
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
		
	}

}