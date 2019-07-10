package javaSE;
class Demo01 {
	public static final String NAME = "刘威";
	public static void method(){
		System.out.println("一个静态方法");
	}
}
interface Inter {
	public static final int COUNT = 100;  //就算不加也默认是static final修饰
}
public class StaticFinalDemo {

	public static void main(String[] args) {
		System.out.println(Demo01.NAME);
		Demo01.method();
		System.out.println(Inter.COUNT);
		System.out.println(new Demo01().NAME);  //匿名对象，只可用一次，下次又要重新匿名
	}

}
