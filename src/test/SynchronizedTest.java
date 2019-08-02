package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedExample {

    public void func1() {
    	//ͬ��һ�������,������һ������
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    
    //ͬ��һ������,������һ������
    public synchronized void func2() {
    	for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
    
    public void func3() {
    	//ͬ��һ���࣬������������
        synchronized (SynchronizedExample.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    
    //ͬ��һ����̬����,������������
    public synchronized static void func4() {
    	for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class SynchronizedTest {

	public static void main(String[] args) {
		SynchronizedExample e1 = new SynchronizedExample();
		SynchronizedExample e2 = new SynchronizedExample();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    //ͬ��(�����ڶ����ͬ��������ͬ������)
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e1.func1());
	    //��ͬ��
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e2.func1());
	    
	    
	    //ͬ��(�������������ͬ�����ͬ����̬����)
	    executorService.execute(() -> e1.func3());
	    executorService.execute(() -> e2.func3());
	}

}
