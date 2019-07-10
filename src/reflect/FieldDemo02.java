package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 * 获取成员变量，步骤如下：
				1. 获取Class对象
				2. 获取构造方法
				3. 通过构造方法，创建对象
				4. 获取指定的成员变量（私有成员变量，通过setAccessible(boolean flag)方法暴力访问）
				5. 通过方法，给指定对象的指定成员变量赋值或者获取值
				public void set(Object obj, Object value)
				在指定对象obj中，将此 Field 对象表示的成员变量设置为指定的新值
				public Object get(Object obj)
         		返回指定对象obj中，此 Field 对象表示的成员变量的值
 */

public class FieldDemo02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class c = Class.forName("reflect.Person");
		Constructor con = c.getConstructor(String.class);
		Object obj = con.newInstance("小明");
		Field nameField = c.getField("name");
		Field ageField = c.getField("age");
		Field addField = c.getDeclaredField("address");
		addField.setAccessible(true); //取消 Java 语言访问检查
		//5，通过方法，给指定对象的指定成员变量赋值或者获取值
		System.out.println("name = "+ nameField.get(obj));
		System.out.println("age = "+ ageField.get(obj));
		System.out.println("address = "+ addField.get(obj));
		//赋值
		ageField.set(obj, 21);
		addField.set(obj, "武汉");
		System.out.println("------------------------");
		System.out.println("name = "+ nameField.get(obj));
		System.out.println("age = "+ ageField.get(obj));
		System.out.println("address = "+ addField.get(obj));
		
	}

}
