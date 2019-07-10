package test;

import java.util.ArrayList;
import java.util.Random;

class Resource{
	public int i;
}
class front implements Runnable{
	public int k=0;
	Resource r;
	Random rd = new Random();
	public front(Resource r) {
		this.r = r;
	}
	public void run() {
		while(r.i<100) {
			synchronized(r) {
				ArrayList<String> list = new ArrayList<String>();
				for(int j=0;j<7;j++) {
					int ran = rd.nextInt(38);
					list.add(ran+"");
				}
				System.out.println("编号为: "+r.i+"的员工 从"+Thread.currentThread().getName()+"入场! 拿到的双色球彩票号码是: "+list);
				r.i++;
				k++;
			}
		}
	}
}
class back implements Runnable{
	public int z=0;
	Resource r;
	Random rd = new Random();
	public back(Resource r) {
		this.r = r;
	}
	public void run() {
		while(r.i<100) {
			synchronized(r) {
				ArrayList<String> list = new ArrayList<String>();
				for(int j=0;j<7;j++) {
					int ran = rd.nextInt(38);
					list.add(ran+"");
				}
				System.out.println("编号为: "+r.i+"的员工 从"+Thread.currentThread().getName()+"入场! 拿到的双色球彩票号码是: "+list);
				r.i++;
				z++;
			}
		}
	}
}
public class ThreadTest02 {

	public static void main(String[] args) {
		Resource r = new Resource();
		r.i=1;
		front f = new front(r);
		back b = new back(r);
		Thread t1 = new Thread(f,"前门");
		Thread t2 = new Thread(b,"后门");
		t1.start();
		t2.start();
		System.out.println("从前门入场的员工总共:"+f.k+"名员工");
		System.out.println("从后门入场的员工总共:"+b.z+"名员工");
	}

}
