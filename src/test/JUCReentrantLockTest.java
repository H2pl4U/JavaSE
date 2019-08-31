package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLock1{
	private Lock lock = new ReentrantLock();
	public void fun() {
		try {
			lock.lock();
			for (int i = 0; i < 1000; i++) {
				System.out.println(i);
			}
		}finally {
			lock.lock();
		}
	}
}

public class JUCReentrantLockTest {

	public static void main(String[] args) {
		ReentrantLock1 lockExample = new ReentrantLock1();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    executorService.execute(() -> lockExample.fun());
	    executorService.execute(() -> lockExample.fun());
	}

}
