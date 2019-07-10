package reflect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * �������������.class�ļ�����û�з���Լ���ģ������������ǳ�Ϊ���͵Ĳ���
 * ͨ�����似������������з���Լ���ļ����У�����������͵�Ԫ��
 */
import java.util.ArrayList;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("java.util.ArrayList");
		ArrayList<Integer> list = new ArrayList<Integer>();
		//���Ԫ�ص�����
		list.add(new Integer(30));
		list.add(new Integer("12345"));
		list.add(123);
		System.out.println(list);
		//ͨ�����似������������з���Լ���ļ����У�����������͵�Ԫ��
		Method addmethod = c.getDeclaredMethod("add", Object.class);
		addmethod.invoke(list, "������");
		System.out.println(list);
		
	}

}
