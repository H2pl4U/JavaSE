package javaSE;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CountdownLatch用来控制一个或者多个线程等待多个线程。
 * 维护了一个计数器 cnt，每次调用 countDown() 方法会让计数器的值减 1，减到 0 的时候，
 * 那些因为调用 await() 方法而在等待的线程就会被唤醒。
 */
public class JUCCountdownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		final int totalThread = 5;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("run..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
        
	}

}
