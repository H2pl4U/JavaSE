package reflect;

import java.lang.reflect.Field;

/*
 * 获取成员变量
 * 返回一个成员变量
 *			public Field getField(String name) 获取指定的 public修饰的变量
 *			public Field getDeclaredField(String name) 获取指定的任意变量
 *	返回多个成员变量
 *			public Field[] getFields() 获取所有public 修饰的变量
 *			    public Field[] getDeclaredFields() 获取所有的 变量 (包含私有)
 */
public class FieldDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class c = Class.forName("reflect.Person");
		//获取成员变量
		//多个变量    获取指定的 public修饰的变量
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		//多个变量   获取所有的 变量 (包含私有)
		Field[] fields2 = c.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field);
		}
		
		System.out.println("------------------------------------------------");
		//一个变量
		//修饰符为public的成员变量
		Field nameField = c.getField("name");
		System.out.println(nameField);
		Field ageField = c.getField("age");
		System.out.println(ageField);
		
		// 获取指定的任意变量
		Field addressField = c.getDeclaredField("address");
		System.out.println(addressField);
		
	}

}
