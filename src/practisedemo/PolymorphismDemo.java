package practisedemo;
abstract class Animal{
	public abstract void eat(); 
}
class Dog extends Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
	public void keepHome(){
		System.out.println("看家");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("吃鱼");
	}
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.eat();
		if(!(dog instanceof Dog)){
			System.out.println("类型不匹配，不能转换"); 
	 		return; 
		}
		Dog d = (Dog) dog;
		d.keepHome();
		Animal cat = new Cat();
		cat.eat();
		if(!(cat instanceof Cat)){
			System.out.println("类型不匹配，不能转换"); 
	 		return; 
		}
		Cat c = (Cat) cat;
		c.catchMouse();

	}

}
