package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedExample {

    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

public class SynchronizedTest {

	public static void main(String[] args) {
		SynchronizedExample e1 = new SynchronizedExample();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e1.func1());
	}

}
