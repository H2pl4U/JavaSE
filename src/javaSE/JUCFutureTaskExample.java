package javaSE;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * �ڽ��� Callable ʱ����֪���������з���ֵ������ֵͨ�� Future ���з�װ��
 * FutureTask ʵ���� RunnableFuture �ӿڣ��ýӿڼ̳��� Runnable �� Future �ӿڣ�
 * ��ʹ�� FutureTask �ȿ��Ե���һ������ִ�У�Ҳ�����з���ֵ��
 * 
 * FutureTask �������첽��ȡִ�н����ȡ��ִ������ĳ�������һ������������Ҫִ�кܳ�ʱ�䣬
 * ��ô�Ϳ����� FutureTask ����װ����������߳�������Լ�������֮����ȥ��ȡ�����
 */
public class JUCFutureTaskExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(10);
                    result += i;
                }
                return result;
            }
        });

        Thread computeThread = new Thread(futureTask);
        computeThread.start();

        Thread otherThread = new Thread(() -> {
            System.out.println("other task is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        otherThread.start();
        System.out.println(futureTask.get());	//4950
	}

}
