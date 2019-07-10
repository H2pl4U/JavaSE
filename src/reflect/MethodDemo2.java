package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("reflect.Person");
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("jjf",20,"ÃÏ√≈");
		Method m4 = c.getMethod("method4", String.class);
		Object res = m4.invoke(obj, "jrf");
		System.out.println("result:"+res);
	}

}
