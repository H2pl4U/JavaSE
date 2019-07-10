package javaSE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class NetWorkUDPreceiveDemo {

	public static void main(String[] args) throws Exception {
		//创建DatagramSocket对象，并指定端口号
		DatagramSocket receiveSocket = new DatagramSocket(12306);
		//创建DatagramPacket对象，并建立一个空仓库
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		//接收数据存储到DatagramPacket对象中
		receiveSocket.receive(dp);
		//获取DatagramPacket对象中的内容
		//1，获取发送端ip地址	getAddress()
		String ip = dp.getAddress().getHostAddress();
		//2,获取发送端发送的数据	getData()
		byte[] data = dp.getData();
		//3,获取发送端发送数据的长度   getLength()
		int len = dp.getLength();
		//4,显示收到的数据
		String datastr = new String(data,0,len);
		System.out.println("ip:"+ip+"内容:"+datastr);
		//释放流资源
		receiveSocket.close();
		
	}
;
}
