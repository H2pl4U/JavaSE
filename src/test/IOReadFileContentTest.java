package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//���ж��ı�����
public class IOReadFileContentTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\\\Java\\\\FileDemo\\\\cn1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		// װ����ģʽʹ�� BufferedReader �����һ�� Reader ����
	    // �ڵ��� BufferedReader �� close() ����ʱ��ȥ���� Reader �� close() ����
	    // ���ֻҪһ�� close() ���ü���
		br.close();
	}

}
