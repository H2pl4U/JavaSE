package javaSE;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CountdownLatch��������һ�����߶���̵߳ȴ�����̡߳�
 * ά����һ�������� cnt��ÿ�ε��� countDown() �������ü�������ֵ�� 1������ 0 ��ʱ��
 * ��Щ��Ϊ���� await() �������ڵȴ����߳̾ͻᱻ���ѡ�
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
