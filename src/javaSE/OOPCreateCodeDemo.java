package javaSE;
class Person03 {
	private String name;
	private int age;
	
	Person03(){
		System.out.println("Person03无参数的构造函数执行");
	}
	Person03(int age){
		this.age = age;
		System.out.println("Person03（age）参数的构造函数执行");
	}
	   //构造代码块
		{
			System.out.println("构造代码块执行了");
		}
		//构造静态代码块  优先于构造代码块
		static{
			System.out.println("静态代码块执行了");
		}
		@Override
		public String toString() {
			return "Person03 [name=" + name + ", age=" + age + "]";
		}
		
}
public class OOPCreateCodeDemo {
	static{
		System.out.println("Demo中的静态代码块");
	}

	public static void main(String[] args) {
		{
			System.out.println("代码块");
		}
		Person03 p = new Person03();
		Person03 p1 = new Person03(23);
		System.out.println("p:"+p+" p1:"+p1);
		
	}

}
