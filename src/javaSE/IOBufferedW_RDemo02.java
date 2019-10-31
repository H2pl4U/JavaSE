package javaSE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * ���ø�Ч���ַ�������������ı��ļ��ĸ�ֵ
 * ����Դ�� file.txt
 * Ŀ�ĵأ� copyFile.txt
 * 
 * ������
 * 	1��ָ������Դ�� ������Դ�ж����ݣ�����������
 * 	2,ָ��Ŀ�ĵأ��ǰ�����д��Ŀ�ĵأ����������
 * 	3,������
 * 	4��д����
 * 	5���ر���
 */

public class IOBufferedW_RDemo02 {

	public static void main(String[] args) throws IOException {
		//1��ָ������Դ�� ������Դ�ж����ݣ�����������
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\FileDemo\\cn1.txt"));
		//2,ָ��Ŀ�ĵأ��ǰ�����д��Ŀ�ĵأ����������
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\Java\\FileDemo\\cnBWCopy.txt")));
		
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
