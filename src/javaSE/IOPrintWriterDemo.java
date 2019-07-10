package javaSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOPrintWriterDemo {

	public static void main(String[] args) throws IOException {
		function();
		function2();
		function3();
	}
	
	/* 
	 * ��ӡ��,���Կ����Զ�ˢ�¹���
	 * ����2������:
	 *   1. ���������Ŀ�ı�����������
	 *       OutputStream  Writer
	 *   2. �������println,printf,format���������е�һ��,�����Զ�ˢ��
	 */

	private static void function3() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo\\pwdemo4.txt");
		PrintWriter pw= new PrintWriter(fos, true);
		pw.print("i");
		pw.print("love");
		pw.print("java");
		pw.close();
		
	}

	/*
	 * ��ӡ�����Ŀ����String��������
	 * 
	 * ��ӡ��,���Ŀ��,��������
	 * �������ֽ������,�������ַ��������
	 * OutputStream  Writer
	 */

	private static void function() throws IOException {
//		FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\FileDemo\\pwdemo1.txt"));
		FileWriter fw = new FileWriter(new File("D:\\Java\\FileDemo\\pwdemo2.txt"));
		PrintWriter pw = new PrintWriter(fw);
		pw.print("��ӡ��");
		pw.close();;
	}
	/*
	 * ��ӡ��,���Ŀ��,String�ļ���
	 */
	private static void function2() throws IOException {
		PrintWriter pw = new PrintWriter("D:\\Java\\FileDemo\\pwdemo3.txt");
		pw.print(3.5);
		pw.close();
	}

}
