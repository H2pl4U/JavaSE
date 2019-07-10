package javaSE;
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println("run..."+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("main..."+i);
		}
		
	}

}
