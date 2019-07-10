package javaSE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class NetWorkUDPreceiveDemo {

	public static void main(String[] args) throws Exception {
		//����DatagramSocket���󣬲�ָ���˿ں�
		DatagramSocket receiveSocket = new DatagramSocket(12306);
		//����DatagramPacket���󣬲�����һ���ղֿ�
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		//�������ݴ洢��DatagramPacket������
		receiveSocket.receive(dp);
		//��ȡDatagramPacket�����е�����
		//1����ȡ���Ͷ�ip��ַ	getAddress()
		String ip = dp.getAddress().getHostAddress();
		//2,��ȡ���Ͷ˷��͵�����	getData()
		byte[] data = dp.getData();
		//3,��ȡ���Ͷ˷������ݵĳ���   getLength()
		int len = dp.getLength();
		//4,��ʾ�յ�������
		String datastr = new String(data,0,len);
		System.out.println("ip:"+ip+"����:"+datastr);
		//�ͷ�����Դ
		receiveSocket.close();
		
	}
;
}
