package javaSE;
/*
 * 文件上传  服务器端
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
		//1,创建服务器，等待客户端连接
		ServerSocket ss = new ServerSocket(8000);
		Socket clientSocket = ss.accept();
		//显示哪个客户端Socket连接上了服务器
		InetAddress ipObject = clientSocket.getInetAddress(); // 得到ip地址对象
		String ip = ipObject.getHostAddress();   //得到ip地址字符串
		System.out.println("抓到你了，连接我"+"ip:"+ip);
		//获取Socket的输入流
		InputStream in = clientSocket.getInputStream();
		//创建目的地的字节输出流
		BufferedOutputStream fileout = new BufferedOutputStream(new FileOutputStream("D:\\Java\\FileDemo\\Irving.jpg"));
		//把Socket输入流中的数据，写入目的地的字节输出流中
		byte[] buf = new byte[1024];
		int len = -1;
		while((len=in.read(buf))!=-1) {
			//写入目的地的字节输出流中
			fileout.write(buf, 0, len);
		}
		
		//-----------------反馈信息---------------------
		//10,获取Socket的输出流, 作用：写反馈信息给客户端
		OutputStream out = clientSocket.getOutputStream();
		//写反馈信息给客户端
		out.write("凯里的图片上传成功".getBytes());
		out.close();
		fileout.close();
		in.close();
		clientSocket.close();
		
	}

}
