package javaSE;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * �ļ��ϴ� �ͻ���
 * 
 * public void shutdownOutput()  ���ô�Socket�������,��ӵ��൱�ڸ�֪�˷���������д�����
 */
public class NetWorkTCPClientDemo02 {

	public static void main(String[] args) throws Exception{
		//�����ͻ���Socket�����ӷ�����
		Socket s = new Socket("192.168.231.1",8000);
		//��ȡSocket���е�����������ܣ�����������д��������
		OutputStream out =  s.getOutputStream();
		//�����ֽ������������ܣ�������ȡ����Դ(ͼƬ)���ֽ�
		BufferedInputStream filein = new BufferedInputStream(new FileInputStream("D:\\Java\\FileDemo\\Irving7.jpg"));
		//��ͼƬ����д��Socket���������(�����ݴ���������)
		byte[] buf = new byte[1024];
		int len = -1;
		while((len=filein.read(buf))!=-1) {
			//������д��Socket���������
			out.write(buf, 0, len);
		}
		//�ͻ��˷���������ϣ�����Socket�������д���������֪��������
		s.shutdownOutput();
		//-----------------������Ϣ---------------------
		//12,��ȡSocket��������  ���ã� ��������Ϣ
		InputStream in = s.getInputStream();
		//��������Ϣ
		byte[] info = new byte[1024];
		//�ѷ�����Ϣ�洢��info�����У�����¼�ֽڸ���
		int length = in.read(info);
		//��ʾ�������
		System.out.println(new String(info,0,length));
		//�ر���
		in.close();
		filein.close();
		out.close();
		s.close();
		
	}

}
