package javaSE;
abstract class Develop {
	public abstract void work();
}
 class javaEE extends Develop {
	public void work(){
		System.out.println("javaEE");
	}
}
 class Android extends Develop {
	public void work(){
		System.out.println("Android");
	}
}

public class OOPAbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaEE ee = new javaEE();
		ee.work();
		Android an = new Android();
		an.work();

	}

}
