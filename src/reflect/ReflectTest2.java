package reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("D:\\Java\\FileDemo\\test01.txt"));
		String className = pro.getProperty("className");
		System.out.println(className);
		Class c = Class.forName(className);
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("jjh",20,"Œ‰∫∫");
		String methodName = pro.getProperty("methodName");
		Method m5 = c.getDeclaredMethod(methodName, null);
		m5.setAccessible(true);
		m5.invoke(obj, null);
		
	}

}
