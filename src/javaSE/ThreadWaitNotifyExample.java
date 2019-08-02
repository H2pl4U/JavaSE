package javaSE;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WaitNotifyExample {

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}

/*
 * ���� wait() ʹ���̵߳ȴ�ĳ���������㣬�߳��ڵȴ�ʱ�ᱻ����
 * �������̵߳�����ʹ�������������ʱ�������̻߳���� notify() 
 * ���� notifyAll() �����ѹ�����̡߳�
 *
 * ���Ƕ����� Object ��һ���֣��������� Thread��
 * ֻ������ͬ����������ͬ�����ƿ���ʹ�ã������������ʱ�׳� IllegalMonitorStateException��
 * 
 * ʹ�� wait() �����ڼ䣬�̻߳��ͷ�����������Ϊ�����û���ͷ�����
 * ��ô�����߳̾��޷���������ͬ����������ͬ�����ƿ��У���ô��
 * �޷�ִ�� notify() ���� notifyAll() �����ѹ�����̣߳������
 * ����
 */
public class ThreadWaitNotifyExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
	    WaitNotifyExample example = new WaitNotifyExample();
	    //��ִ��after������������wait����Ҫnotify����
	    executorService.execute(() -> example.after());
	    executorService.execute(() -> example.before());
	}

}
