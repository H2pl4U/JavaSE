package practisedemo;
abstract class Audi{
	public abstract void drive();
}
class elegentAudi extends Audi{
	public void drive(){
		System.out.println("与别的车一样能开");
	}
	public void Autodrive(){
		System.out.println("无人驾驶");
	}
	public void AutoPart(){
		System.out.println("自动泊车");
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		Audi ad=new elegentAudi();
		ad.drive();
		if(!(ad instanceof Audi)){
			System.out.println("类型错误");
			return;
		}
		elegentAudi Ead = (elegentAudi) ad;
		Ead.Autodrive();
		Ead.AutoPart();

	}
}
