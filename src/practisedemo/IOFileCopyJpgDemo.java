package practisedemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileCopyJpgDemo {
	/*
	 * ���󣺽�d:\\Java\\FileDemo\\Irving.jpg�ļ����и���
	 * 		����4�ַ�ʽ����
	 * 		��ʽ1�� ���û���������һ��һ���ֽڵķ�ʽ����	����ʱ     96����
	 * 		��ʽ2�� ���û���������һ������ֽڵķ�ʽ��ֵ	����ʱ     6����
	 * 		��ʽ3�� ���ø�Ч������һ��һ���ֽڵķ�ʽ����	����ʱ     9����
	 * 		��ʽ4�� ���ø�Ч������һ������ֽڵķ�ʽ��ֵ	����ʱ      5����
	 * 
	 * ����Դ�� d:\\Java\\FileDemo\\Irving.jpg
	 * Ŀ�ĵ�1: d:\\Java\\FileDemo\\copy1.jpg
	 * Ŀ�ĵ�2: d:\\Java\\FileDemo\\copy2.jpg
	 * Ŀ�ĵ�3: d:\\Java\\FileDemo\\copy3.jpg
	 * Ŀ�ĵ�4: d:\\Java\\FileDemo\\copy4.jpg
	 * 
	 * ʵ�ֵĲ��裺
	 * 	1��ָ������Դ
	 * 	2��ָ��Ŀ�ĵ�
	 * 	3��������
	 * 	4��д����
	 * 	5���ر���
	 * 
	 */
	public static void main(String[] args) throws IOException {
		//��ʱ��ʼ
		long start = System.currentTimeMillis();
		//��ʽ1�� ���û���������һ��һ���ֽڵķ�ʽ����
		method1("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy1.jpg");
		//��ʽ2�� ���û���������һ������ֽڵķ�ʽ��ֵ
		method2("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy2.jpg");
		//��ʽ3�� ���ø�Ч������һ��һ���ֽڵķ�ʽ����
		method3("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy3.jpg");
		//��ʽ4�� ���ø�Ч������һ������ֽڵķ�ʽ��ֵ
		method4("d:\\Java\\FileDemo\\Irving.jpg", "d:\\Java\\FileDemo\\copy4.jpg");
		//��ʱ����
		long end = System.currentTimeMillis();
		//ͳ�Ƹ������ĸ��ƺ�ʱ
		System.out.println("���ַ�����ʱΪ"+(end-start));
	}

	private static void method4(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(src)));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest)));
		byte[] buf = new byte[1024];
		int len=0;
		while((len=bis.read(buf))!=-1){
			bos.write(buf, 0, len);
		}
		bis.close();
		bos.flush();
		bos.close();
	}

	private static void method3(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(src)));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest)));
		int ch=0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		bis.close();
		bos.flush();
		bos.close();
	}

	private static void method2(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(new File(src));
		FileOutputStream fos = new FileOutputStream(new File(dest));
		byte[] buf = new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		fis.close();
		fos.flush();
		fos.close();
		
	}

	private static void method1(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(new File(src));
		FileOutputStream fos = new FileOutputStream(new File(dest));
		int ch = 0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fis.close();
		fos.close();
		
	}

}
