package practisedemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ticket2 implements Runnable{
	private int ticket2 = 100;
	private Lock lock = new ReentrantLock();
	public void run(){
		while(true){
			lock.lock();
				if(ticket2>0){
					try{
						Thread.sleep(1);
						System.out.println(Thread.currentThread().getName() + "������Ʊ:" + ticket2--);
					}catch(InterruptedException e){
						e.getStackTrace();
					}finally {
						lock.unlock();
					}
				}
		}
		
	}
}

public class ThreadLockDemo {

	public static void main(String[] args) {
		ticket2 ticket2 = new ticket2();
		Thread t1 = new Thread(ticket2,"����1");
		Thread t2 = new Thread(ticket2,"����2");
		Thread t3 = new Thread(ticket2,"����3");
		t1.start();
		t2.start();
		t3.start();
	}

}
