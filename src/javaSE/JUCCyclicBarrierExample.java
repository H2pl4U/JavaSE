package javaSE;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CyclicBarrier�������ƶ���̻߳���ȴ���ֻ�е�����̶߳�����ʱ��
 * ��Щ�̲߳Ż����ִ�С�
 * �� CountdownLatch ���ƣ�����ͨ��ά����������ʵ�ֵġ��߳�ִ�� await() 
 * ����֮���������� 1�������еȴ���ֱ��������Ϊ 0�����е��� await() ����
 * ���ڵȴ����̲߳��ܼ���ִ�С�
 * 
 * CyclicBarrier �� CountdownLatch ��һ�������ǣ�CyclicBarrier �ļ�����
 * ͨ������ reset() ��������ѭ��ʹ�ã��������Ž���ѭ�����ϡ�
 * 
 * CyclicBarrier ���������캯�������� parties ָʾ�������ĳ�ʼֵ��
 * barrierAction �������̶߳��������ϵ�ʱ���ִ��һ�Ρ�

 */
public class JUCCyclicBarrierExample {

	public static void main(String[] args) {
		final int totalThread = 5;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("before..");
                try {
					cyclicBarrier.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
                System.out.print("after..");
            });
        }
        executorService.shutdown();
	}

}
