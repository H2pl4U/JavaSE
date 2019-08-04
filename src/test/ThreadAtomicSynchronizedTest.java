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
 * ����ʹ��ԭ����֮�⣬Ҳ����ʹ�� synchronized ����������֤������ԭ���ԡ�
 * ����Ӧ���ڴ�佻������Ϊ��lock �� unlock���������ʵ���϶�Ӧ���ֽ���
 * ָ��Ϊ monitorenter �� monitorexit��
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
