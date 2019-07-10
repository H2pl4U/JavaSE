package javaSE;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"   ִ���߳�����");
	}
}

/*
 * 	jdk1.5 ���������� ʵ���̳߳س���
 *  ʹ�ù�����Executors�еľ�̬���������̶߳���,ָ���̸߳���
 *  static ExecutorService newFixedThreadPool(int ����)   �����̳߳ض���
 *  ���ص���ExecutorService�ӿڵ�ʵ���ࣨ�̳߳ض���
 *  
 *  �ӿ�ʵ������󣬵��÷���submit��Runnable r���ύ�߳�ִ������
 */

public class ThreadPoolDemo {

	public static void main(String[] args) {
		//���ù�����ľ�̬���������̶߳���
		//�����̳߳ض���  �˶���Ϊ�ӿ�
		ExecutorService es = Executors.newFixedThreadPool(2);
		//���ýӿ�ʵ�������es�еķ���submit�ύ�߳�ִ������
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	}

}
