package javaSE;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*
 * TCP �ͻ���
 * 
 * 1�������ͻ���Socket����,��ָ��Ҫ���ӵķ�������ַ��˿ںţ�
 * 2,��ȡ�������˵ķ�����������Ϣ
 * 3,�ر�����Դq
 */
public class NetWorkTCPClientDemo {

	public static void main(String[] args) throws IOException{
		//1�������ͻ���Socket����,��ָ��Ҫ���ӵķ�������ַ��˿ںţ�
		Socket s = new Socket("192.168.231.1", 8888);
		//2,��ȡ�������˵ķ�����������Ϣ
		InputStream in = s.getInputStream();
		//��ȡ��ȡ���е�����
		byte[] buffer = new byte[1024];
		//�����е����ݴ洢�������У�����¼��ȡ�ֽڵĸ���
		int length = in.read(buffer);
		//��ʾ����
		System.out.println( new String(buffer, 0 , length) );
		//3,�ر�����Դ
		in.close();
		s.close();
		
	}

}
