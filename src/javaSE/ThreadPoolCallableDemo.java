package javaSE;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 *  Callable �ӿڵ�ʵ���࣬��Ϊ�߳��ύ�������
 *  ʹ�÷�������ֵ
 */
class ThreadPoolCallable implements Callable<String>{
	public String call(){
		return "abc";
	}
}

/*
 * ʵ���̳߳���֮ʵ��Callable�ӿڷ�ʽ
 * ʵ�ֲ��裺
 * 	������Executors��̬����newFixedThreadPool�����������̳߳ض���
 *  �̳߳ض���ExecutorService�ӿ�ʵ���࣬���÷���submit�ύ�߳�����
 *  submit(Callable c)
 */

public class ThreadPoolCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		//�ύ�߳�����ķ���submit��������Future�ӿڵ�ʵ����
		Future<String> f =es.submit(new ThreadPoolCallable());
		System.out.println(f.get());
	}

}
