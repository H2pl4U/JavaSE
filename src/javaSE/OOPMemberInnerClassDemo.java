package javaSE;
class Body{
	private boolean life = true;
	public class heart{
		public void jump(){
			System.out.println("ĞÄÔàÔÚÌø");
			System.out.println("ÉúÃü×´Ì¬£º"+life);
		}
		
	}
}

public class OOPMemberInnerClassDemo {

	public static void main(String[] args) {
		Body.heart Bh = new Body().new  heart();
		Bh.jump();
	}

}
