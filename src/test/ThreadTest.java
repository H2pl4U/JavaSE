package test;

import java.util.Random;

class one implements Runnable{
	Random rd = new Random();
	int[] arr;
	public one(int[] arr) {
		this.arr=arr;
	}
	public void run() {
		while(true) {
			int ran = rd.nextInt(11);
			System.out.println(Thread.currentThread().getName()+"�ֲ�����һ�� "+arr[ran]+"Ԫ��");
		}
	}
}
class two implements Runnable{
	Random rd = new Random();
	int[] arr;
	public two(int[] arr) {
		this.arr=arr;
	}
	public void run() {
		while(true) {
			int ran = rd.nextInt(10);
			System.out.println(Thread.currentThread().getName()+"�ֲ�����һ�� "+arr[ran]+"Ԫ��");
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
		one o = new one(arr);
		two t = new two(arr);
		Thread t1 = new Thread(o,"�齱��1");
		Thread t2 = new Thread(t,"�齱��2");
		t1.start();
		t2.start();
	}

}
