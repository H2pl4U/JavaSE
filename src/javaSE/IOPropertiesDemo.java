package javaSE;

import java.util.Properties;
import java.util.Set;

public class IOPropertiesDemo {
	  /*
		* A: Properties���ϴ洢��ֵ��		
		* a: ��������
		*  ���϶���Properties��,�̳�Hashtable,ʵ��Map�ӿ�
		*  ���Ժ�IO������ʹ��,ʵ�����ݵĳ־ô洢
		* ʹ��Properties����,�洢��ֵ��
		* setProperty��ͬ��Map�ӿ��е�put
		* setProperty(String key, String value)
		* ͨ������ȡֵ, getProperty(String key)
		*/

	public static void main(String[] args) {
		function();
	}
	
	/*
	 * ʹ��Properties����,�洢��ֵ��
	 * setProperty��ͬ��Map�ӿ��е�put
	 * setProperty(String key, String value)
	 * ͨ������ȡֵ, getProperty(String key)
	 */

	private static void function() {
		Properties pro = new Properties();
		//Ϊproperties���Ԫ��
		pro.setProperty("jjf", "fzk");
		pro.setProperty("one", "first");
		pro.setProperty("two", "second");
		pro.setProperty("three", "third");
		System.out.println(pro);
		
		//��ȡkeyֵ��Ӧ��value
		System.out.println(pro.getProperty("two"));
		
		//����proԪ��   ����map
		Set<String> set = pro.stringPropertyNames();
		for (String key : set) {
			System.out.println(key+" = "+pro.getProperty(key));
		}
	}

}
