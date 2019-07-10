package javaSE;
class ticket implements Runnable{
	private int ticket = 100;
	private Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(ticket>0){
					try{
						Thread.sleep(1);
					}catch(InterruptedException e){
						e.getStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
				}
			}
		}
		
	}
}
public class ThreadDemo02 {

	public static void main(String[] args) {
		ticket ticket = new ticket();
		Thread t1 = new Thread(ticket,"窗口1");
		Thread t2 = new Thread(ticket,"窗口2");
		Thread t3 = new Thread(ticket,"窗口3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
