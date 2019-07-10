package practisedemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ���߳��첽���㣺�����̷ֱ߳�����141*253��244*123
 */

class ThreadPoolCallable implements Callable<Integer>{
	private int a;
	private int b;
	public ThreadPoolCallable(int a,int b){
		this.a=a;
		this.b=b;
	}
	public Integer call(){
		return a*b;
	}
	
}

public class ThreadPoolCallableDemo02 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new ThreadPoolCallable(141, 253));
		Future<Integer> f2 = es.submit(new ThreadPoolCallable(244, 123));
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		
	}

}
