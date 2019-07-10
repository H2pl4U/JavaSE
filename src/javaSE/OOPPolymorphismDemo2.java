package javaSE;
//描述动物类，并抽取共性eat方法
abstract class Animal {
	abstract void eat();
}

//描述狗类，继承动物类，重写eat方法，增加lookHome方法
class Dog extends Animal {
	void eat() {
		System.out.println("啃骨头");
	}

	void lookHome() {
		System.out.println("看家");
	}
}

//描述猫类，继承动物类，重写eat方法，增加catchMouse方法
class Cat extends Animal {
	void eat() {
		System.out.println("吃鱼");
	}

	void catchMouse() {
		System.out.println("抓老鼠");
	}
}


public class OOPPolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog(); //多态形式，创建一个狗对象
		a.eat(); // 调用对象中的方法，会执行狗类中的eat方法
		// a.lookHome();//使用Dog类特有的方法，需要向下转型，不能直接使用
		
		// 为了使用狗类的lookHome方法，需要向下转型
//向下转型过程中，可能会发生类型转换的错误，即ClassCastException异常
		// 那么，在转之前需要做健壮性判断 
		if( !(a instanceof Dog)){ // 判断当前对象是否是Dog类型
		 		System.out.println("类型不匹配，不能转换"); 
		 		return; 
		} 
		Dog d = (Dog) a; //向下转型
		d.lookHome();//调用狗类的lookHome方法

	}

}
