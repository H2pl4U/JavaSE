package reflect;
/*
 * 获取.class字节码文件对象的方式
 * 		1：通过Object类中的getObject()方法
 * 		2: 通过 类名.class 获取到字节码文件对象
 * 		3: 反射中的方法,
 * 			public static Class<?> forName(String className) throws ClassNotFoundException
 * 			返回与带有给定字符串名的类或接口相关联的 Class 对象 
 */

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//1：通过Object类中的getObject()方法
		Person p1 = new Person();
		Class c1 = p1.getClass();
		System.out.println("c1:  "+c1);
		
		//2: 通过 类名.class 获取到字节码文件对象
		Class c2 = Person.class;
		System.out.println("c2: "+c2);
		
		// 3: 反射中的方法
		Class c3 = Class.forName("reflect.Person");
		System.out.println("c3: "+c3);
	}

}
