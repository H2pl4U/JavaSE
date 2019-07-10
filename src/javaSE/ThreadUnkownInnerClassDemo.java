package javaSE;

public class ThreadUnkownInnerClassDemo {

	public static void main(String[] args) {
		//�����߳������ڲ���
		new Thread() {
			public void run(){
				for(int i=0;i<20;i++){
					System.out.println("Thread.."+i);
				}
			}
		}.start();
		
		//����Runnable�����ڲ��ӿ�
		Runnable rn = new Runnable(){
			public void run(){
				for(int i=0;i<20;i++){
					System.out.println("Runnable.."+i);
				}
			}
		};
		new Thread(rn).start();
		
		//���Ϸ�ʽ
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
