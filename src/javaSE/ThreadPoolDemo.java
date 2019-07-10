package javaSE;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"   执行线程任务");
	}
}

/*
 * 	jdk1.5 出的新特性 实现线程池程序
 *  使用工厂类Executors中的静态方法创建线程对象,指定线程个数
 *  static ExecutorService newFixedThreadPool(int 个数)   返回线程池对象
 *  返回的是ExecutorService接口的实现类（线程池对象）
 *  
 *  接口实现类对象，调用方法submit（Runnable r）提交线程执行任务
 */

public class ThreadPoolDemo {

	public static void main(String[] args) {
		//调用工厂类的静态方法创建线程对象
		//返回线程池对象  此对象为接口
		ExecutorService es = Executors.newFixedThreadPool(2);
		//调用接口实现类对象es中的方法submit提交线程执行任务
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	}

}
