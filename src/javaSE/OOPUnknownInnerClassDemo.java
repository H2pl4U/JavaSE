package javaSE;

abstract class Person02{
	public abstract void eat();
}

public class OOPUnknownInnerClassDemo {

	public static void main(String[] args) {
		//�����ڲ���
		Person02 P =new Person02() {
			public void eat() {
				System.out.println("�ҳ���");
			}
		};
		P.eat();
		//�����������ڲ���
		new Person02(){
			public void eat() {
				System.out.println("��Ҳ����");
			}
		}.eat();
		
	}

}
