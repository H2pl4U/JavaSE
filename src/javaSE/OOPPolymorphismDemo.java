package javaSE;
class Fu1{
	int num=0;
	public void fun(){
		System.out.println("多态后父类中的方法被子类重写");
	}
}
class Zi1 extends Fu1{
	int num =1;
	public void fun(){
		System.out.println("普通类实现多态");
	}
}
class Zi11 extends Fu1{
	public void fun(){
		System.out.println("在调用方法时，调用的为各个子类重写后的方法");
	}
}
abstract class Fu2{
	public abstract void fun();
}
class Zi2 extends Fu2{
	public void fun(){
		System.out.println("抽象类实现多态");
	}
}
class Zi22 extends Fu2{
	public void fun(){
		System.out.println("在调用方法时，调用的为各个子类重写后的方法");
	}
}
interface Fu3{
	public abstract void fun();
}
class Zi3 implements Fu3{
	public void fun(){
		System.out.println("接口实现多态");
	}
}
class Zi33 implements Fu3{
	public void fun(){
		System.out.println("在调用方法时，调用的为各个子类重写后的方法");
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
		System.out.println("未多态，num被子类重写后,num="+z1.num);
		System.out.println("多态后子类并没有重写num成功,num="+p1.num);
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
