package practisedemo;
abstract class Audi{
	public abstract void drive();
}
class elegentAudi extends Audi{
	public void drive(){
		System.out.println("���ĳ�һ���ܿ�");
	}
	public void Autodrive(){
		System.out.println("���˼�ʻ");
	}
	public void AutoPart(){
		System.out.println("�Զ�����");
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		Audi ad=new elegentAudi();
		ad.drive();
		if(!(ad instanceof Audi)){
			System.out.println("���ʹ���");
			return;
		}
		elegentAudi Ead = (elegentAudi) ad;
		Ead.Autodrive();
		Ead.AutoPart();

	}
}
