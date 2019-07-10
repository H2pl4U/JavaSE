package javaSE;
class Party{
	public void puffBall(){
		class Ball{
			public void puff(){
				System.out.println("气球膨胀了");
			}
		}
		new Ball().puff();   //  创建匿名对象调用puff方法
	}
}
public class OOPLocalInnerClassDemo {

	public static void main(String[] args) {
		Party p = new Party();
		p.puffBall();
	}

}
