package javaSE;

import java.net.InetAddress;

public class NetWorkDemo {

	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		InetAddress bd = InetAddress.getByName("www.baidu.com");
		System.out.println("������IP��ַ��"+local.getHostAddress());
		System.out.println("�ٶȵ�IP��ַ��"+bd.getHostAddress());
		System.out.println("�ٶȵ�������Ϊ��"+bd.getHostName());
		
	}

}
