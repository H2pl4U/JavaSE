package javaSE;
class Party{
	public void puffBall(){
		class Ball{
			public void puff(){
				System.out.println("����������");
			}
		}
		new Ball().puff();   //  ���������������puff����
	}
}
public class OOPLocalInnerClassDemo {

	public static void main(String[] args) {
		Party p = new Party();
		p.puffBall();
	}

}
