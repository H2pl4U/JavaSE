package javaSE;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 文件上传 客户端
 * 
 * public void shutdownOutput()  禁用此Socket的输出流,间接的相当于告知了服务器数据写入完毕
 */
public class NetWorkTCPClientDemo02 {

	public static void main(String[] args) throws Exception{
		//创建客户端Socket，连接服务器
		Socket s = new Socket("192.168.231.1",8000);
		//获取Socket流中的输出流，功能：用来把数据写到服务器
		OutputStream out =  s.getOutputStream();
		//创建字节输入流，功能：用来读取数据源(图片)的字节
		BufferedInputStream filein = new BufferedInputStream(new FileInputStream("D:\\Java\\FileDemo\\Irving7.jpg"));
		//把图片数据写到Socket的输出流中(把数据传给服务器)
		byte[] buf = new byte[1024];
		int len = -1;
		while((len=filein.read(buf))!=-1) {
			//把数据写到Socket的输出流中
			out.write(buf, 0, len);
		}
		//客户端发送数据完毕，结束Socket输出流的写入操作，告知服务器端
		s.shutdownOutput();
		//-----------------反馈信息---------------------
		//12,获取Socket的输入流  作用： 读反馈信息
		InputStream in = s.getInputStream();
		//读反馈信息
		byte[] info = new byte[1024];
		//把反馈信息存储到info数组中，并记录字节个数
		int length = in.read(info);
		//显示反馈结果
		System.out.println(new String(info,0,length));
		//关闭流
		in.close();
		filein.close();
		out.close();
		s.close();
		
	}

}
