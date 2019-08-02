package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedExample {

    public void func1() {
    	//同步一个代码块,作用于一个对象
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    
    //同步一个方法,作用于一个对象
    public synchronized void func2() {
    	for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
    
    public void func3() {
    	//同步一个类，作用于整个类
        synchronized (SynchronizedExample.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    
    //同步一个静态方法,作用于整个类
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
	    //同步(作用于对象的同步代码块和同步方法)
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e1.func1());
	    //不同步
	    executorService.execute(() -> e1.func1());
	    executorService.execute(() -> e2.func1());
	    
	    
	    //同步(作用于整个类的同步类和同步静态方法)
	    executorService.execute(() -> e1.func3());
	    executorService.execute(() -> e2.func3());
	}

}
