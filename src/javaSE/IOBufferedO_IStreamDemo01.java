package javaSE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBufferedO_IStreamDemo01 {

	public static void main(String[] args) throws IOException {
		writeOuttxt();
		readIntxt();
		
	}

	private static void readIntxt() throws IOException {
		//��������������
		FileInputStream fis = new FileInputStream("D:\\Java\\FileDemo\\test3.txt");
		//�ѻ���������װ�ɸ�Ч����
		BufferedInputStream bis = new BufferedInputStream(fis);
		int ch = 0;
		while((ch=bis.read())!=-1){
			System.out.println((char)ch);
		}
		bis.close();
	}

	private static void writeOuttxt() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo\\test3.txt");
		//ʹ�ø�Ч�������ѻ����������з�װ��ʵ���ٶȵ�����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("abcd".getBytes());
		bos.close();
	}

}
