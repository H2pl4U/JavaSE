package test;

interface USB {
	void start();

	void stop();
}

class C {
	public static void work(USB u) {
		u.start();
		System.out.println("������");
		u.stop();
	}
}

class USBDisk implements USB {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U�̿�ʼ����");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U��ֹͣ����");
	}
}

class Printer implements USB {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����ʼ����");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����������");
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.work(new USBDisk());
		C.work(new Printer());
	}
}
