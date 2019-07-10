package reflect;

import java.lang.reflect.Method;

/*
 * 返回获取一个方法：
			public Method getMethod(String name, Class<?>... parameterTypes)
 		获取public 修饰的方法
			public Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 		获取任意的方法，包含私有的
			参数1: name 要查找的方法名称； 参数2： parameterTypes 该方法的参数类型
		返回获取多个方法：
			public Method[] getMethods() 获取本类与父类中所有public 修饰的方法
			public Method[] getDeclaredMethods() 获取本类中所有的方法(包含私有的)
 */

public class MethodDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class c = Class.forName("reflect.Person");
		//返回获取多个方法：
		//获取本类与父类中所有public 修饰的方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		//获取本类中所有的方法(包含私有的)
		Method[] methods2 = c.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		//返回获取一个方法：
		//获取public 修饰的方法
		System.out.println("-----------------------");
		Method m1 = c.getMethod("method1", null);
		System.out.println(m1);
		Method m2 = c.getMethod("method4", String.class);
		System.out.println(m2);
		//获取任意的方法，包含私有的
		Method m3 = c.getDeclaredMethod("method5", null);
		System.out.println(m3);
	}

}
