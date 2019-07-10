package javaSE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class NetWorkUDPsendDemo {

	public static void main(String[] args) throws Exception {
		//创建DatagramSocket对象
		DatagramSocket sentSocket = new DatagramSocket();
		//创建DatagramPacket对象，并将数据封装
		//public DatagramPacket(byte[] buf, int length, InetAddress address,  int port)
		//构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
		byte[] buf = "hello,UDP".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.231.1"), 12306);
		//发送数据
		sentSocket.send(dp);
		sentSocket.close();
	}

}
