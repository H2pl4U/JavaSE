package practisedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStreamCopyDemo02 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\Java\\FileDemo\\Irving.jpg");
		File f2 = new File("D:\\Java\\FileDemo\\Irvingcopy2.jpg");
		// ��ȷ�ֽ��� ��������Դ��������������Ŀ�Ĺ�����
		FileOutputStream fos =new FileOutputStream(f2);
		FileInputStream fis = new FileInputStream(f1);
		//����һ����������
		byte[] a = new byte[1024];
		int len=0;
		while((len=fis.read(a))!=-1){
			fos.write(a,0,len);		// �������е�ָ�����ȵ�����д�뵽������С�
		}
		fos.close();
		fis.close();
	}

}
