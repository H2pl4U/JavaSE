package test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUnsafeExample {

    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}

/*
 * �������̶߳�ͬһ���������ݽ��з��ʶ�����ȡͬ�������Ļ�����ô�����Ľ���ǲ�һ�µġ�
 * ���´�����ʾ�� 1000 ���߳�ͬʱ�� cnt ִ��������������������֮������ֵ�п���С�� 1000��
 */
public class ThreadUnsafeTest {

	public static void main(String[] args) throws InterruptedException {
		final int threadSize = 1000;
	    ThreadUnsafeExample example = new ThreadUnsafeExample();
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
	    System.out.println(example.get());//989�����С��1000���̲߳���ȫ
	}

}
