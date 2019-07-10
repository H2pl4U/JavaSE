package javaSE;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP ��������
 * 
 * 1,����������ServerSocket����ָ���������˿ںţ�
 * 2�������������ˣ��ȴ��ͻ��˵����ӣ����ͻ������Ӻ󣬿��Ի�ȡ�����ӷ������Ŀͻ���Socket����
 * 3,���ͻ��˷�����Ϣ
 * 4,�ر�����Դ
 */

public class NetWorkTCPServerDemo {

	public static void main(String[] args) throws Exception {
		//1,����������ServerSocket����ָ���������˿ں�
		ServerSocket ss = new ServerSocket(8888);
		//2�������������ˣ��ȴ��ͻ��˵����ӣ����ͻ������Ӻ󣬿��Ի�ȡ�����ӷ������Ŀͻ���Socket����
		Socket s = ss.accept();
		//3,���ͻ��˷�����Ϣ
		/*
		 * a����ȡ�ͻ��˵������
		 * b���ڷ������ˣ�ͨ���ͻ��˵������д���ݸ��ͻ���
		 */
		//a����ȡ�ͻ��˵������
		OutputStream out = s.getOutputStream();
		// b���ڷ������ˣ�ͨ���ͻ��˵������д���ݸ��ͻ���
		out.write("���Ѿ����ӵ��˷�������".getBytes());
		//4,�ر�����Դ
		out.close();
		s.close();
	}

}
