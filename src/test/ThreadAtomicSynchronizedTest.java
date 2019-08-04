package test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AtomicSynchronizedExample {
    private int cnt = 0;

    public synchronized void add() {
        cnt++;
    }

    public synchronized int get() {
        return cnt;
    }
}

/*
 * 除了使用原子类之外，也可以使用 synchronized 互斥锁来保证操作的原子性。
 * 它对应的内存间交互操作为：lock 和 unlock，在虚拟机实现上对应的字节码
 * 指令为 monitorenter 和 monitorexit。
 */
public class ThreadAtomicSynchronizedTest {

	public static void main(String[] args) throws InterruptedException {
		final int threadSize = 1000;
	    AtomicSynchronizedExample example = new AtomicSynchronizedExample();
	    final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    for (int i = 0; i < threadSize; i++) {
	        executorService.execute(() -> {
	            example.add();
	            countDownLatch.countDown();
	        });
	    }
	    countDownLatch.await();
	    executorService.shutdown();
	    System.out.println(example.get());
	}

}
