package javaSE;
class Fu1{
	int num=0;
	public void fun(){
		System.out.println("��̬�����еķ�����������д");
	}
}
class Zi1 extends Fu1{
	int num =1;
	public void fun(){
		System.out.println("��ͨ��ʵ�ֶ�̬");
	}
}
class Zi11 extends Fu1{
	public void fun(){
		System.out.println("�ڵ��÷���ʱ�����õ�Ϊ����������д��ķ���");
	}
}
abstract class Fu2{
	public abstract void fun();
}
class Zi2 extends Fu2{
	public void fun(){
		System.out.println("������ʵ�ֶ�̬");
	}
}
class Zi22 extends Fu2{
	public void fun(){
		System.out.println("�ڵ��÷���ʱ�����õ�Ϊ����������д��ķ���");
	}
}
interface Fu3{
	public abstract void fun();
}
class Zi3 implements Fu3{
	public void fun(){
		System.out.println("�ӿ�ʵ�ֶ�̬");
	}
}
class Zi33 implements Fu3{
	public void fun(){
		System.out.println("�ڵ��÷���ʱ�����õ�Ϊ����������д��ķ���");
	}
}
public class OOPPolymorphismDemo {

	public static void main(String[] args) {
		Fu1 p1 = new Zi1();
		Fu1 p11 = new Zi11();
		Zi1 z1 = new Zi1();
		z1.fun();
		p1.fun();
		p11.fun();
		System.out.println("δ��̬��num��������д��,num="+z1.num);
		System.out.println("��̬�����ಢû����дnum�ɹ�,num="+p1.num);
		Fu2 p2 = new Zi2();
		Fu2 p22 = new Zi22();
		p2.fun();
		p22.fun();
		Fu3 p3 = new Zi3();
		Fu3 p33 =new Zi33();
		p3.fun();
		p33.fun();

	}

}
