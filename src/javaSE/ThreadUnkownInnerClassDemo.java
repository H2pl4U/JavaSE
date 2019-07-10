package javaSE;

public class ThreadUnkownInnerClassDemo {

	public static void main(String[] args) {
		//创建线程匿名内部类
		new Thread() {
			public void run(){
				for(int i=0;i<20;i++){
					System.out.println("Thread.."+i);
				}
			}
		}.start();
		
		//创建Runnable匿名内部接口
		Runnable rn = new Runnable(){
			public void run(){
				for(int i=0;i<20;i++){
					System.out.println("Runnable.."+i);
				}
			}
		};
		new Thread(rn).start();
		
		//整合方式
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<20;i++){
					System.out.println("TOTAL.."+i);
				}
			}
		}).start();
		for(int i=0;i<20;i++){
			System.out.println("main.."+i);
		}
	}

}
