package javaSE;
class Person01{
	public void eat(){
		System.out.println("吃饭");
}
}
class Demo02 {
	public static Person01 getPerson01(){
		//普通方式
		//Person01 p = new Person01();	
		//return p;
		
		//匿名对象作为方法返回值
		return new Person01(); 
	}
	
	public static void method(Person01 p){}
}
public class OOPUnknownObjDemo {

	public static void main(String[] args) {
		//调用getPerson01方法，得到一个Person01对象
				Person01 Person01 = Demo02.getPerson01();
				
				//调用method方法
				Demo02.method(Person01);
				//匿名对象作为方法接收的参数
				Demo02.method(new Person01());
		
	}

}
