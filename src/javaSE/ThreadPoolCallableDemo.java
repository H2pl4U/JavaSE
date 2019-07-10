package javaSE;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 *  Callable 接口的实现类，作为线程提交任务出现
 *  使用方法返回值
 */
class ThreadPoolCallable implements Callable<String>{
	public String call(){
		return "abc";
	}
}

/*
 * 实现线程程序之实现Callable接口方式
 * 实现步骤：
 * 	工厂类Executors静态方法newFixedThreadPool方法，创建线程池对象
 *  线程池对象ExecutorService接口实现类，调用方法submit提交线程任务
 *  submit(Callable c)
 */

public class ThreadPoolCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		//提交线程任务的方法submit方法返回Future接口的实现类
		Future<String> f =es.submit(new ThreadPoolCallable());
		System.out.println(f.get());
	}

}
