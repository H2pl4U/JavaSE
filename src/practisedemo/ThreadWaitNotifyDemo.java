package practisedemo;

class Resource{
	public String name;
	public String sex;
	public boolean flag = true; 
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
				//���Ϊtrue���������޵ȴ�״̬
				if(r.flag) {
					try{r.wait();
					}catch(Exception e) {}
				}
				if(i%2==0) {
					r.name="������";
					r.sex = "��";
				}else {
					r.name="jjf";
					r.sex="nv";
				}
				//�������Ϊtrue�����ѶԷ��߳�
				r.flag = true;
				r.notify();
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
				//���Ϊfalse���������޵ȴ�״̬
				if(!r.flag) {
					try {
						r.wait();
					}catch(Exception e) {}
				}
				System.out.println(r.name+"..."+r.sex);
				//�������Ϊfalse�����Է��̻߳���
				r.flag=false;
				r.notify();
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
