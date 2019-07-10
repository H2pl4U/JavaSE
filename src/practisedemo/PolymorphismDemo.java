package practisedemo;
abstract class Animal{
	public abstract void eat(); 
}
class Dog extends Animal{
	public void eat(){
		System.out.println("�й�ͷ");
	}
	public void keepHome(){
		System.out.println("����");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("����");
	}
	public void catchMouse(){
		System.out.println("ץ����");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.eat();
		if(!(dog instanceof Dog)){
			System.out.println("���Ͳ�ƥ�䣬����ת��"); 
	 		return; 
		}
		Dog d = (Dog) dog;
		d.keepHome();
		Animal cat = new Cat();
		cat.eat();
		if(!(cat instanceof Cat)){
			System.out.println("���Ͳ�ƥ�䣬����ת��"); 
	 		return; 
		}
		Cat c = (Cat) cat;
		c.catchMouse();

	}

}
