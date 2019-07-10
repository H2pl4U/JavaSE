package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("reflect.Person");
		//获取所有构造方法
		//格式：Constructor[] cons = Class对象.getDeclaredConstructors();
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------");
		//获取一个构造方法
		//public Person()
		Constructor con1 = c.getConstructor(null);
		System.out.println(con1);
		
		//public Person(String name)
		Constructor con2 = c.getConstructor(String.class);
		System.out.println(con2);
		
		//private Person(String name, int age)
		Constructor con3 = c.getDeclaredConstructor(String.class,int.class);
		System.out.println(con3);
		//3,暴力反射 ,取消java访问检查
		con3.setAccessible(true);
		Object obj1 = con3.newInstance("jrf",20);
		System.out.println(obj1);
		
		//public Person(String name, int age, String address)
		Constructor con4 = c.getDeclaredConstructor(String.class,int.class,String.class);
		System.out.println(con4);
		Object obj2 = con4.newInstance("jjf",20,"天门");
		System.out.println(obj2);
	}

}
