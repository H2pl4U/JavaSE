package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOFileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java\\FileDemo\\file1.txt");
		// ����һ���ֽ�����������,������ȷ����Դ����ʵ���Ǵ����ֽڶ�ȡ��������Դ�������
		FileInputStream fis = new FileInputStream(f);
		//����һ���ֽ����顣
		byte[] a = new byte[1024];		//���ȿ��Զ����1024����������
		int len=0;
		while((len=fis.read(a))!=-1){
			System.out.println(new String(a,0,len));
		}
		fis.close();
	}

}
