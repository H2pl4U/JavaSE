package test;

interface USB {
	void start();

	void stop();
}

class C {
	public static void work(USB u) {
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class USBDisk implements USB {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U盘开始工作");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U盘停止工作");
	}
}

class Printer implements USB {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开始工作");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机结束工作");
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.work(new USBDisk());
		C.work(new Printer());
	}
}
