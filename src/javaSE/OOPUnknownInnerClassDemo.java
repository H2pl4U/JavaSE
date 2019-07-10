package javaSE;

abstract class Person02{
	public abstract void eat();
}

public class OOPUnknownInnerClassDemo {

	public static void main(String[] args) {
		//定义内部类
		Person02 P =new Person02() {
			public void eat() {
				System.out.println("我吃了");
			}
		};
		P.eat();
		//匿名对象定义内部类
		new Person02(){
			public void eat() {
				System.out.println("我也吃了");
			}
		}.eat();
		
	}

}
