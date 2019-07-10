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
			//线程锁必须唯一，否则无法解决人妖问题
			synchronized(r) {
				//标记为true，进入无限等待状态
				if(r.flag) {
					try{r.wait();
					}catch(Exception e) {}
				}
				if(i%2==0) {
					r.name="鸡俊飞";
					r.sex = "男";
				}else {
					r.name="jjf";
					r.sex="nv";
				}
				//将标记置为true，唤醒对方线程
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
				//标记为false，进入无限等待状态
				if(!r.flag) {
					try {
						r.wait();
					}catch(Exception e) {}
				}
				System.out.println(r.name+"..."+r.sex);
				//将标记置为false，将对方线程唤醒
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
