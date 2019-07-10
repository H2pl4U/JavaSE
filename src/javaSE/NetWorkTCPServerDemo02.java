package javaSE;
/*
 * �ļ��ϴ�  ��������
 *
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetWorkTCPServerDemo02 {

	public static void main(String[] args) throws Exception {
		//1,�������������ȴ��ͻ�������
		ServerSocket ss = new ServerSocket(8000);
		Socket clientSocket = ss.accept();
		//��ʾ�ĸ��ͻ���Socket�������˷�����
		InetAddress ipObject = clientSocket.getInetAddress(); // �õ�ip��ַ����
		String ip = ipObject.getHostAddress();   //�õ�ip��ַ�ַ���
		System.out.println("ץ�����ˣ�������"+"ip:"+ip);
		//��ȡSocket��������
		InputStream in = clientSocket.getInputStream();
		//����Ŀ�ĵص��ֽ������
		BufferedOutputStream fileout = new BufferedOutputStream(new FileOutputStream("D:\\Java\\FileDemo\\Irving.jpg"));
		//��Socket�������е����ݣ�д��Ŀ�ĵص��ֽ��������
		byte[] buf = new byte[1024];
		int len = -1;
		while((len=in.read(buf))!=-1) {
			//д��Ŀ�ĵص��ֽ��������
			fileout.write(buf, 0, len);
		}
		
		//-----------------������Ϣ---------------------
		//10,��ȡSocket�������, ���ã�д������Ϣ���ͻ���
		OutputStream out = clientSocket.getOutputStream();
		//д������Ϣ���ͻ���
		out.write("�����ͼƬ�ϴ��ɹ�".getBytes());
		out.close();
		fileout.close();
		in.close();
		clientSocket.close();
		
	}

}
