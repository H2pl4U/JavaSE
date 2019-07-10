package javaSE;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*
 * OutputStreamWriter��InputStreamReader���ַ����ֽڵ�������Ҳ���Գ�֮Ϊ�ַ�ת�������ַ�ת����ԭ���ֽ���+�����
	FileWriter��FileReader����Ϊ���࣬����Ϊ�����ַ��ļ��ı������ڡ����������ַ��ļ���ʹ�õ���Ĭ�ϱ����ʱ���Բ��ø��࣬
	��ֱ�����������ɲ����ˣ����˴��롣
	InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));//Ĭ���ַ�����
	InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");//ָ��GBK�ַ�����
	FileReader fr = new FileReader("a.txt");
	���������Ĺ�����һ���ģ����е�������Ϊ��ݡ�
	ע�⣺һ��Ҫָ����������ʱ�����Բ��������࣬����ʹ���ַ�ת������ʲôʱ���������أ�
	������
	1�����������ļ���2��ʹ��Ĭ�ϱ��롣
	�ܽ᣺
	�ֽ�--->�ַ� �� ��������--->���Ķ��ġ�  ��Ҫ������������ InputStreamReader
	�ַ�--->�ֽ� �� ���Ķ���--->�������ġ�  ��Ҫд��������� OutputStreamWriter
 */

public class IOInputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		readCN();
	}

	private static void readCN() throws IOException {
		InputStream in = new FileInputStream("D:\\Java\\FileDemo\\test2.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.println((char)ch);
		}
		
		//�ı����������ֽڵķ�ʽ��ֵ������
		
//		char[] buf = new char[40960];
//		int len=0;
//		while((len=isr.read())!=-1){
//			System.out.println(new String(buf,0,len));
//		}
		isr.close();
		
	}

}
