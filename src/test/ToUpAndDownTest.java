package test;

class A{
	public void tell1(){
		System.out.println("A-->tell1");
	}
	public void tell2(){
		System.out.println("A-->tell2");
	}
}
class B extends A{
	public void tell1(){
		System.out.println("B-->tell1");
	}
	public void tell4(){
		System.out.println("B-->tell4");
	}
}
public class ToUpAndDownTest {

	public static void main(String[] args) {
		// ����ת��
//		B b= new B();
//		A a=b;
//		a.tell1();
//		a.tell2();
		//����ת��
		A a = new B();
		B b =(B)a;
		b.tell1();
		b.tell2();
		b.tell4();
		
	}

}
