package javaSE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class NetWorkUDPsendDemo {

	public static void main(String[] args) throws Exception {
		//����DatagramSocket����
		DatagramSocket sentSocket = new DatagramSocket();
		//����DatagramPacket���󣬲������ݷ�װ
		//public DatagramPacket(byte[] buf, int length, InetAddress address,  int port)
		//�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
		byte[] buf = "hello,UDP".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.231.1"), 12306);
		//��������
		sentSocket.send(dp);
		sentSocket.close();
	}

}
