package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("reflect.Person");
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("jjf",20,"Œ‰∫∫");
		Method m5 = c.getDeclaredMethod("method5", null);
	}

}
