package javaSE;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer> {
    public Integer call() {
        return 123;
    }
}

/*
 * Callable �����з���ֵ������ֵͨ�� FutureTask ���з�װ��
 */
public class ThreadCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable mc = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<Integer>(mc);
		Thread t = new Thread(ft);
		t.start();
		System.out.println(ft.get());
	}

}
