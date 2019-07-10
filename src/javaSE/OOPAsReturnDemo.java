package javaSE;
//接口   (普通类和抽象类与接口同理不再code)
interface Smoke{
	public abstract void smoking();
}
class Student04 implements Smoke{
	public void smoking() {
		System.out.println("Smoking");
	}
}
public class OOPAsReturnDemo {

	public static void main(String[] args) {
		//调用method方法，获取返回的会吸烟的对象
				Smoke s = method();
				//通过s变量调用smoking方法,这时实际调用的是Student对象中的smoking方法
				s.smoking();
				Smoke m = new Student04();
				method2(m);
	}

	private static void method2(Smoke m) {
		m.smoking();
		
	}

	public static Smoke method(){
		Smoke sm = new Student04();
		return sm;
	}

}
