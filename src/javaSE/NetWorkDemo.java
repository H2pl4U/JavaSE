package javaSE;

import java.net.InetAddress;

public class NetWorkDemo {

	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		InetAddress bd = InetAddress.getByName("www.baidu.com");
		System.out.println("本机的IP地址："+local.getHostAddress());
		System.out.println("百度的IP地址："+bd.getHostAddress());
		System.out.println("百度的主机名为："+bd.getHostName());
		
	}

}
