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
				System.out.println("���Ϊ: "+r.i+"��Ա�� ��"+Thread.currentThread().getName()+"�볡! �õ���˫ɫ���Ʊ������: "+list);
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
				System.out.println("���Ϊ: "+r.i+"��Ա�� ��"+Thread.currentThread().getName()+"�볡! �õ���˫ɫ���Ʊ������: "+list);
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
		Thread t1 = new Thread(f,"ǰ��");
		Thread t2 = new Thread(b,"����");
		t1.start();
		t2.start();
		System.out.println("��ǰ���볡��Ա���ܹ�:"+f.k+"��Ա��");
		System.out.println("�Ӻ����볡��Ա���ܹ�:"+b.z+"��Ա��");
	}

}
