package reflect;
/*
 * ��ȡ.class�ֽ����ļ�����ķ�ʽ
 * 		1��ͨ��Object���е�getObject()����
 * 		2: ͨ�� ����.class ��ȡ���ֽ����ļ�����
 * 		3: �����еķ���,
 * 			public static Class<?> forName(String className) throws ClassNotFoundException
 * 			��������и����ַ����������ӿ�������� Class ���� 
 */

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//1��ͨ��Object���е�getObject()����
		Person p1 = new Person();
		Class c1 = p1.getClass();
		System.out.println("c1:  "+c1);
		
		//2: ͨ�� ����.class ��ȡ���ֽ����ļ�����
		Class c2 = Person.class;
		System.out.println("c2: "+c2);
		
		// 3: �����еķ���
		Class c3 = Class.forName("reflect.Person");
		System.out.println("c3: "+c3);
	}

}
