package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedExample {

    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

public class SynchronizedTest {

	public static void main(String[] args) {
		SynchronizedExample e1 = new SynchronizedExample();
		SynchronizedExample e2 = new SynchronizedExample();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e1.func1());
	    //0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e2.func1());
	    //0,1,0,1,2,3,4,2,3,4,5,6,7,5,6,7...½»Ìæ
	}

}
