package practisedemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadPoorCallable implements Callable<Integer>{
	private  int num;
	public ThreadPoorCallable(int num){
		this.num=num;
	}
	public Integer call(){
		int sum=0;
		for(int i =1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
}

/*
 * 多线程的异步运算：
 *  线程池建立两个线程，一个计算从1+2+..+100的和，第二个计算1到200的和
 */
public class ThreadPoolCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new ThreadPoorCallable(100));
		Future<Integer> f2 = es.submit(new ThreadPoorCallable(200));
		System.out.println(f1.get());
		System.out.println(f2.get());
		
	}

}
