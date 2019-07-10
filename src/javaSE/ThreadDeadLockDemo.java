package javaSE;


//œﬂ≥ÃÀ¿À¯
class LockA{
	private LockA() {
		
	}
	public static final LockA locka = new LockA();
}
class LockB{
	private LockB() {
		
	}
	public static final LockB lockb = new LockB();
}

class DeadLock implements Runnable{
	private int i = 0;
	public void run() {
		while(true) {
			if(i%2==0) {
				synchronized(LockA.locka) {
					System.out.println("if  ......locka");
					synchronized(LockB.lockb) {
						System.out.println("if .......lockb");
					}
				}
			}else {
				synchronized(LockB.lockb) {
					System.out.println("else ......lockb");
					synchronized(LockA.locka) {
						System.out.println("else ......locka");
					}
				}
			}
			i++;
		}
	}
}

public class ThreadDeadLockDemo {

	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		Thread t1 = new Thread(dl);
		Thread t2 = new Thread(dl);
		t1.start();
		t2.start();
		
		
	}

}
