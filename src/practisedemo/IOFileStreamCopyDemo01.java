package practisedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStreamCopyDemo01 {

	public static void main(String[] args) throws IOException {
		/*
		 * �������������֮����ͨ��ch��������������ݽ����ġ�
			���������ļ��и����⣬ÿ�ζ���Դ�ļ���ȡһ����Ȼ����д��ָ���ļ���
			�����ٶ�ȡһ���ַ���Ȼ����дһ����һֱ������ȥ��Ч�ʼ��͡�
		 */
		//1,��ȷԴ��Ŀ�ġ�
		File f1 = new File("D:\\Java\\FileDemo\\Irving.jpg");
		File f2 = new File("D:\\Java\\FileDemo\\Irvingcopy.jpg");
		//2,��ȷ�ֽ��� ��������Դ��������������Ŀ�Ĺ�����
		FileOutputStream fos =new FileOutputStream(f2);
		FileInputStream fis = new FileInputStream(f1);
		//3, ʹ���������Ķ�ȡ������ȡ�ֽڣ������ֽ�д�뵽Ŀ���С�
		int ch=0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fos.close();
		fis.close();
	}

}
