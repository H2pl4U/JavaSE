package javaSE;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetWorkTCPForThreadDemo {

	public static void main(String[] args) throws IOException {
		//1,�������������ȴ��ͻ�������
				ServerSocket serverSocket = new ServerSocket(6666);
				
				//ʵ�ֶ���ͻ������ӷ������Ĳ���
				while(true){
					final Socket clientSocket = serverSocket.accept();
					//�����̣߳�����뵱ǰ�ͻ��˵����ݽ�������
					new Thread(){
						public void run() {
							try{
								//��ʾ�ĸ��ͻ���Socket�������˷�����
								InetAddress ipObject = clientSocket.getInetAddress();//�õ�IP��ַ����
								String ip = ipObject.getHostAddress(); //�õ�IP��ַ�ַ���
								System.out.println("С����ץ�����ˣ������ң���" + "IP:" + ip);
								
								//7,��ȡSocket��������
								InputStream in = clientSocket.getInputStream();
								//8,����Ŀ�ĵص��ֽ������   D:\\upload\\192.168.74.58(1).jpg
								BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("D:\\upload\\"+ip+"("+System.currentTimeMillis()+").jpg"));
								//9,��Socket�������е����ݣ�д��Ŀ�ĵص��ֽ��������
								byte[] buffer = new byte[1024];
								int len = -1;
								while((len = in.read(buffer)) != -1){
									//д��Ŀ�ĵص��ֽ��������
									fileOut.write(buffer, 0, len);
								}
								
								//-----------------������Ϣ---------------------
								//10,��ȡSocket�������, ���ã�д������Ϣ���ͻ���
								OutputStream out = clientSocket.getOutputStream();
								//11,д������Ϣ���ͻ���
								out.write("ͼƬ�ϴ��ɹ�".getBytes());
								
								out.close();
								fileOut.close();
								in.close();
								clientSocket.close();
							} catch(IOException e){
								e.printStackTrace();
							}
						};
					}.start();
				}

	}

}
