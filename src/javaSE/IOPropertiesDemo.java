package javaSE;

import java.util.Properties;
import java.util.Set;

public class IOPropertiesDemo {
	  /*
		* A: Properties集合存储键值对		
		* a: 方法介绍
		*  集合对象Properties类,继承Hashtable,实现Map接口
		*  可以和IO对象结合使用,实现数据的持久存储
		* 使用Properties集合,存储键值对
		* setProperty等同与Map接口中的put
		* setProperty(String key, String value)
		* 通过键获取值, getProperty(String key)
		*/

	public static void main(String[] args) {
		function();
	}
	
	/*
	 * 使用Properties集合,存储键值对
	 * setProperty等同与Map接口中的put
	 * setProperty(String key, String value)
	 * 通过键获取值, getProperty(String key)
	 */

	private static void function() {
		Properties pro = new Properties();
		//为properties添加元素
		pro.setProperty("jjf", "fzk");
		pro.setProperty("one", "first");
		pro.setProperty("two", "second");
		pro.setProperty("three", "third");
		System.out.println(pro);
		
		//获取key值对应的value
		System.out.println(pro.getProperty("two"));
		
		//遍历pro元素   类似map
		Set<String> set = pro.stringPropertyNames();
		for (String key : set) {
			System.out.println(key+" = "+pro.getProperty(key));
		}
	}

}
