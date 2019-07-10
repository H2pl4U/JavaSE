package javaSE;
class Resource{
	public String name;
	public String sex;
}
class Input implements Runnable{
	private Resource r;
	private int i = 0;
	public Input(Resource r) {
		this.r=r;
	}
	public void run() {
		while(true) {
			//�߳�������Ψһ�������޷������������
			synchronized(r) {
				if(i%2==0) {
					r.name="������";
					r.sex = "��";
				}else {
					r.name="jjf";
					r.sex="nv";
				}
			}
			i++;
		}
	}
}
class Output implements Runnable{
	private Resource r;
	public Output(Resource r) {
		this.r= r;
	}
	public void run() {
		while(true){
			synchronized(r) {
				System.out.println(r.name+"..."+r.sex);
			}
		}
	}
}
public class ThreadWaitNotifyDemo {

	public static void main(String[] args) {
		Resource r = new Resource();
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
		
	}

}
