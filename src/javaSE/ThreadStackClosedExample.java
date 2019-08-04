package javaSE;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StackClosedExample {
    public void add100() {
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}

/*
 * ջ���
 * ����̷߳���ͬһ�������ľֲ�����ʱ����������̰߳�ȫ���⣬
 * ��Ϊ�ֲ������洢�������ջ�У������߳�˽�еġ�
 */
public class ThreadStackClosedExample {

	public static void main(String[] args) {
		StackClosedExample example = new StackClosedExample();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    executorService.execute(() -> example.add100());
	    executorService.execute(() -> example.add100());
	    executorService.shutdown();
	}

}
