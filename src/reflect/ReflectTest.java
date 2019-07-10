package reflect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * 程序编译后产生的.class文件中是没有泛型约束的，这种现象我们称为泛型的擦除
 * 通过反射技术，来完成向有泛型约束的集合中，添加任意类型的元素
 */
import java.util.ArrayList;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("java.util.ArrayList");
		ArrayList<Integer> list = new ArrayList<Integer>();
		//添加元素到集合
		list.add(new Integer(30));
		list.add(new Integer("12345"));
		list.add(123);
		System.out.println(list);
		//通过反射技术，来完成向有泛型约束的集合中，添加任意类型的元素
		Method addmethod = c.getDeclaredMethod("add", Object.class);
		addmethod.invoke(list, "哈哈哈");
		System.out.println(list);
		
	}

}
