package test;

class Dog {

    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getObjectAddress() {
        return super.toString();
    }
}

public class PassByValueTest {

	public static void main(String[] args) {
		//对象
		Dog dog = new Dog("jjf");
		System.out.println(dog.getObjectAddress());//test.Dog@6d06d69c
		func(dog);
		System.out.println(dog.getObjectAddress());//test.Dog@6d06d69c
		System.out.println(dog.getName()); //jjf
		
		System.out.println("------------------------------");
		//基本类型
		int num = 10;
		func2(num);
		System.out.println(num);
		//String
		String str = "aaa";
		func3(str);
		System.out.println(str);
	}

	private static void func3(String str) {
		str="bbb";
		System.out.println(str);
	}

	private static void func2(int num) {
		num = 100;
		System.out.println(num);
	}

	private static void func(Dog dog) {
		System.out.println(dog.getObjectAddress());//test.Dog@6d06d69c
		dog=new Dog("AAA");
		System.out.println(dog.getObjectAddress());//test.Dog@7852e922
		System.out.println(dog.getName());	//AAA
		
	}

}
